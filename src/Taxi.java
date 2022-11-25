 class taxi extends Transportation{
    int taxi_number;

    String destination; //목적지

    int distanceToDestination; //목적지까지 거리
    int base_distance; //기본 거리
    int rate_per_Distance; //거리당 요금
    String taxi_form;  //운행중, 일반, 운행불가
    int rate_total;
    int nowPassenger;
    int money_total;


    void start_driving(){

    }
    void changeForm_taxi(){
        if(gas>=10){
            taxi_form = "운행";
        }else{
            taxi_form = "운행불가";
            System.out.println("주유 필요");
        }
    }
    void onboarding_taxi(int passenger, String destination, int distanceToDestination){
        if ( taxi_form == "일반") {
            if (nowPassenger <= gas) {
                taxi_form = "운행중";
                nowPassenger += passenger;
                System.out.println("탑승 승객 수 = " + nowPassenger);
                System.out.println("잔여 승객 수 = " + (maxMember - nowPassenger));
                System.out.println("기본 요금 확인 = " + speedChange);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 = " + distanceToDestination + "km");
                add_rate(distanceToDestination);
                System.out.println("상태 = " + taxi_form);
            }else{
                System.out.println("최대 승객 수 초과");
            }
        }
    }
    void changespeed_taxi(int changespeed){
        speed += changespeed;
    }

    void add_rate(int distanceToDestination){
        if(distanceToDestination>base_distance){
            rate_total = speedChange + rate_per_Distance*(distanceToDestination-base_distance);
            System.out.println("지불할 요금 = "+rate_total);
        }else{
            rate_total = speedChange;
            System.out.println("지불할 요금 = "+rate_total);
        }
    }
    void payment(){
        System.out.println("누적 요금 = "+rate_total );
        nowPassenger = 0;
        taxi_form = "일반";
        money_total +=rate_total;
    }
    taxi(int taxi_number){
        super(100, 0);
        this.nowPassenger = 0;
        this.maxMember = 4;
        this.speedChange = 3000;
        this.rate_per_Distance = 1000;
        this.base_distance = 1;
        this.gas = 100;
        this.taxi_form = "일반";
        this.speed = 0;
        this.money_total = 0;
        System.out.println(taxi_number+"번 택시 생성");

    }
}