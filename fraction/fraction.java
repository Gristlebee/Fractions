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
        gcf(n,d);
        reduce();
        
    }
    public fraction(String f){
        int slashindex=f.indexOf("/");
        if(d==0) {
       System.out.println("Error");
       d=1;
        } else{
          this.d=d;  
            
        }
        String num =f.substring(0,slashindex);
        String dem =f.substring(slashindex+1);
        this.n= Integer.parseInt(num);
        this.d= Integer.parseInt(dem);
    }
    public fraction(fraction f) {
        this.n=n;
        this.d=d;
    }
    public int getN() {
        return this.n;
    }
    public int getD() {
        return this.d;
    }
    public String toStr() {
        return n+"/"+d;
    }
    public double dec(int n, int d) {
        this.n=n;
        this.d=d;
        double n2=n;
        double d2=d;
        if(d==0) {
          System.out.println("Error");
          d=1;
        } else{
          this.d=d;  
            
        }
        double q;
        q=n2/d2;
        System.out.println(q);
        return q;
    }
    public void reduce () {
        int gcd = gcf(this.n, this.d);
        this.n = this.n / gcd;
        this.d = this.d / gcd; 
        /* n = Math.abs(n);
        d = Math.abs(d);
        int gcf=0;
        int d2=d;
       if (n == 0 || d == 0)
        {
            return 1;
        }

        while (n != d)
        {
            if (n > d) {
                n = n - d; gcf=n;}
            else {
                d = d - n; gcf=d;}
        } 
        System.out.println(n+","+d2);
        System.out.println(gcf);
        //n=n/gcf;
        //d=d/gcf;
        System.out.println(n/gcf+","+d2/gcf);
        return n;
        */
    }
    public int gcf(int n,int d) {
        n = Math.abs(n);
        d = Math.abs(d);

        if (n == 0 || d == 0)
        {
            return 1;
        }

        while (n != d)
        {
            if (n > d)
                n = n - d;
            else
                d = d - n;
        }
       // System.out.println(n);
        return n;
        
    }
    //public Fraction multiply(Fraction a, Fraction b) {
        
        
    //}
    public void multipy(fraction f) {
        this.n=this.n*f.n;
        this.d *= f.d;
        this.reduce();
    }
  }