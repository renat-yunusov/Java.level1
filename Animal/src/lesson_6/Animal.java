package lesson_6;

class Animal {
    String name;
    int run;
    int swim;
    double jump;

    void run(int a){

        int r = this.run;
        if (r > 0 && a <= r){
            System.out.println(this.name+ " can run: true");
        } else {
            System.out.println(this.name+ " can run: false");
        }

    }
    void swim(int b){

        int s = this.swim;
        if (s > 0 && b <= s){
            System.out.println(this.name+ " can swim: true");
        } else {
            System.out.println(this.name+ " can swim: false");
        }

    }
    void jump(double c){
        double j = this.jump;
        if (j > 0 && c <= j){
            System.out.println(this.name+ " can jump: true");
        } else {
            System.out.println(this.name+ " can jump: false");
        }

    }

}
