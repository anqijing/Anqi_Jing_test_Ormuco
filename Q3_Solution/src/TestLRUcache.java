public class TestLRUcache {
    public static void main(String[] args) {
        LRUcache cache = new LRUcache(4);
        String[] IP = {"127.0.0.1", "192.168.1.15", "172.16.254.1", "127.0.0.1", "127.0.0.1",
                "33.22.11.00"};
        double[] longitudes = {99.0, 31.3, 91.3, 78.0, 44.4};
        double[] latitudes = {31.9, 54.3, 42.1, 90.1, 55.5};
        for (int i = 0; i < 4; i++) {
            cache.insert(i, IP[i], longitudes[i], latitudes[i]);
        }

        System.out.println("The current size is " + cache.size());
        System.out.println("Display the current cache");
        cache.display();
        System.out.println();


        cache.insert(4, IP[4], longitudes[4], latitudes[4]);

        System.out.println("The current size is " + cache.size());
        System.out.println("Display the current cache");
        cache.display();
    }
}
