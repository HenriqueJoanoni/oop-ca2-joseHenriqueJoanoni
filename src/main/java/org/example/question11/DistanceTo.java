package org.example.question11;


public class DistanceTo implements Comparable<DistanceTo> {
    private String target;
    private int distance;

    public DistanceTo(String city, int dist) {
        target = city;
        distance = dist;
    }

    public String getTarget() {
        return target;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(DistanceTo other) {
        return Integer.compare(this.distance, other.distance);
    }
}
