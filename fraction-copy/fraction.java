class fraction{
    private int n;
    private int d;
    public fraction(){
      this.n=0;
      this.d=1;
    }
    public fraction(int n, int d) {
     this.n=n;
     if(d==0) {
       System.out.println("Error");
       d=1;
        } else{
          this.d=d;  
            
        }
    }
    public fraction(String f){
        int slashindex=f.indexOf("/");
        String num =f.substring(0,slashindex);
        String dem =f.substring(slashindex+1);
        this.n= Integer.parseInt(num);
        this.d= Integer.parseInt(dem);
    }
    public fraction(fraction f) {
        this.n=n;
        this.d=d;
    }
    
    public getX() {
    return this.n;
  }
}