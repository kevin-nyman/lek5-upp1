class Main {
    public static void main(String[] args) {
        
        Bil bil1 = new Bil("ABC123", "Volvo", "245 GL", 1983);
        System.out.println(bil1);
        
        int h =bil1.getHastighet();
        System.out.println("hastighet " + h);
        
        bil1.ökaHastighet(10);
        bil1.bromsa(5);
        
        h =bil1.getHastighet();
        System.out.println("hastighet " + h);
        
        bil1.ökaHastighet(-10);
        
        Bil except = new Bil("", "Volvo", "245 GL", 1983);
        
    }
}
