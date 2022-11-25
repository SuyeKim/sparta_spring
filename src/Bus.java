class bus extends Transportation{
    int nowPassenger;   //현재 승객수
    int bus_number;
    String bus_form;       // 운행, 차고지행

    void start_driving(){

    }

    //상태변경
    void changeForm_bus(){
        if(gas<7){
            bus_form = "차고지행";
        }else if (gas < 10){
            System.out.println("주유가 필요하다");
        }
    }
    void onboarding_bus(int passenger){
        if (bus_form == "운행"){
            if (((nowPassenger+passenger) <= maxMember)){
                nowPassenger += passenger;
                System.out.println("탑승 승객 수 = "+passenger);
                System.out.println("잔여 승객 수 = "+(maxMember-nowPassenger));
                System.out.println("요금 확인 = "+(passenger*speedChange));
            }else{
                System.out.println("알럿 '최대 승객 수 초과'");
            }
        }


    }
    void changespeed_bus(int speedChange){
        if(gas >= 10){
            speed += speedChange;
        }else{
            System.out.println("주유량을 확인해 주세요");
        }
    }
    bus(int bus_number) {
        super(100,0 );
        this.maxMember = 30;
        this.bus_form = "운행";
        this.speedChange = 1000;
        System.out.println(bus_number+"번 버스 생성");
    }

}