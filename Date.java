class Date {
    
    private String month;
    private String date;
    
    public Date(String inputMonth, String inputDate) {
        
        this.month = inputMonth;
        this.date = inputDate;
    
    }
    
    protected void printDateInfo() {
        System.out.println(
                "Month:" + month + "\n" +
                "Date:" + date            
        );
    }
    

}