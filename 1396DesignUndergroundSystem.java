class UndergroundSystem {
    Map<Integer, Status> customers;
    Map<String, ArrayList> times;
    public UndergroundSystem() {
        customers = new HashMap<>();
        times = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        customers.put(id, new Status(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        if (customers.containsKey(id)) {
            Status s = customers.get(id);
            String stations = s.startStation + "-" + stationName;
            int length = t - s.startT;
            
            if (!times.containsKey(stations)) {
                times.put(stations, new ArrayList<Integer>());
            }

            ArrayList list = times.get(stations);
            list.add(length);
            times.put(stations, list);  
            customers.put(id, null);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String stations = startStation + "-" + endStation;
        ArrayList list = times.get(stations);
        int sum = 0;
        
        if (times.containsKey(stations) && list.size() > 0) {
            for(int i = 0; i < list.size(); i ++) {
                sum += (int)list.get(i);
            }
            return (double)sum/list.size();
        }
        
        return 0;
    }
}

class Status{
    String startStation;
    int startT;
    
    public Status (String startStation, int startT) {
        this.startStation = startStation;
        this.startT = startT;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */