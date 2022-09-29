package algorithms.lesson4;


import java.util.Arrays;

/**
 * Входные данные : Массив точек, представленных с использованием координат x и y
 * Шаг 0: Создайте отсортированный массив px, который является отсортированным массивом исходного массива по координате x.
 * Создайте отсортированный массив py, который является отсортированным массивом исходного массива по координате y.
 * Инициализируйте low равным 0, а high - n-1 (где n - длина массива)
 * Шаг 1: Найдите среднюю точку (mid) px, используя (low + hight) / 2
 * Шаг 2: Разделите массив px на две половины, первый подмассив содержит от px[low] до  px[mid], а второй массив
 * содержит от px[mid + 1] до px[high]
 * Шаг 3: Рекурсивно вычислите наименьшее расстояние как от левого, так и от правого подмассивов leftMin и rightMin,
 * а затем вычислите минимум LeftMin и right, который называется min.
 * Шаг 4: Создайте полосу координат из py array, расстояние до которой меньше min, и вычислите минимальное значение
 * из полосы координат, которая называется minFromStrip
 * Шаг 5: Наконец, минимум - это минимум leftMin, rightMin и min от полосы
 * Вывод : Пара точек, которые находятся ближе в плоскости
 */
public class ClosestPairOfPoints {
    // point class
    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static double MIN_VAL = Double.MAX_VALUE;

    // Method to find the min distance
    public double closestPair(Point[] points){
        int n = points.length;
        Point[] xSorted = new Point[n];
        Point[] ySorted = new Point[n];

        for(int i=0; i<n; i++){
            xSorted[i] = points[i];
            ySorted[i] = points[i];
        }
        // sort array using x coordinate
        Arrays.sort(xSorted, (p1, p2) -> p1.x - p2.x);

        // sort array using y coordinate
        Arrays.sort(ySorted, (p1, p2) -> p1.y - p2.y);

        return closestPair(xSorted, ySorted, 0, n-1);
    }


    // recursive call to find the closest pair distance
    private double closestPair(Point[] px, Point[] py, int low, int high) {
        // count points in the search space
        int n = high - low + 1;

        //If there are 2 or 3 points, then use brute force
        if (n <= 3) {
            return closestPairUsingBruteForce(px);
        }

        // find middle element of the search space
        // to divide the space into two halves
        int mid = low + (high - low)/2 ;
        Point midPoint = px[mid];

        // find left and right min recursively
        double leftMin = closestPair(px, py, low, mid);
        double rightMin = closestPair(px, py, mid+1, high);

        // find the min distance from left and right search space
        double minDistance = Math.min(leftMin, rightMin);

        // there might be possibility that min distance might be there by one point from left and one point from right
        // to find such scenarios create strip of distance minDistance from both sides
        // find the strip of values which are closer at a distance of d
        int stripLeft = -1;
        int stripRight = -1;

        for(int i=low; i<high; i++) {
            if( Math.abs(py[i].x - midPoint.x) < minDistance ) {
                if(stripLeft == -1) {
                    stripLeft = i;
                }else {
                    stripRight = i;
                }
            }
        }
        // now find the min distance from strip of points
        double minFromStrip = getMinStripeDistance(py, stripLeft, stripRight);
        // finally min distance id the one min of left, right and from the strip
        return min(minDistance, minFromStrip);
    }


    // brute force method to check min distance
    // this method is used only if we have <=3 points in the plane
    public double closestPairUsingBruteForce(Point[] points) {
        double min = MIN_VAL;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distance(points[i], points[j]);
                if(dist < min) {
                    min = dist;
                }
                min = min(min, dist);
            }
        }
        return min;
    }

    // min distance in strip of points
    private double getMinStripeDistance(Point[] ySorted, int low, int high) {
        double min = MIN_VAL ;

        //Pick all points one by one and try the next points till the difference
        //between y coordinates is smaller than d.
        //This is a proven fact that this loop runs at most 6 times
        for(int i=low; i<=high; i++) {
            for(int j=i+1; j<=high; j++) {
                min = min(min, distance(ySorted[i], ySorted[j]));
            }
        }
        return min;
    }

    // Method to find distance between two points p1 nd p2
    private double distance(Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x) * (p1.x-p2.x) + (p1.y-p2.y) * (p1.y-p2.y)) ;
    }

    // method to find min between two values
    private double min(double val1, double val2) {
        return Math.min(val1, val2);
    }

    // driver method
    public static void main(String[] args) {
        int[] x = {2, 12, 40, 5, 12, 3};
        int[] y = {3, 30, 50, 1, 10, 4};

        int n = x.length;
        Point[] points = new Point[n] ;

        for(int i=0; i<n; i++) {
            points[i] = new Point(x[i], y[i]);
        }

        ClosestPairOfPoints obj = new ClosestPairOfPoints();
        double distance = obj.closestPair(points);

        System.out.println(distance);
    }
}
