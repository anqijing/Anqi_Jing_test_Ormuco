public class CacheNode {
    int key;
    String IP;
    int expiration = 300;
    double longitude;
    double latitude;

    CacheNode pre;
    CacheNode next;

    public CacheNode(int key, String IP, double longitude, double latitude) {
        this.key = key;
        this.IP = IP;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IP: " + this.IP + " ");
        sb.append("Location: " + "(" + latitude + ", " + longitude + ").");
        return sb.toString();
    }

}
