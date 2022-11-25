public class Transportation {
    int number; //번호
    int gas; // 주유량
    int speed; //속도
    int speedChange; //속도변경
    int maxMember; //최대 승객수

    //기능 운행시작
    void start(){
        System.out.println("출발합니다.");
    }
    //속도변경
    void speedChange(){

    }
    //상태변경
    void changeForm(){

    }
    //승객탑승
    void boardingMember(){

    }


    //기본값
    Transportation(int gas, int speed) {
        this.gas = 100;
        this.speed = 0;

    }
}