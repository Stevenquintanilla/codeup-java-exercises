package shapes;

import util.Input;

public class Circle {

        private double radius;
        private int numOfCircles = 0;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.pow(this.radius, 2) * Math.PI;
        }

        public double getCircumference() {
            return 2 * Math.PI * this.radius;
        }

        public int getNumOfCircles() {
            return this.numOfCircles;
        }

        public int addNumOfCircles() {
            return this.numOfCircles++;
        }
    }
