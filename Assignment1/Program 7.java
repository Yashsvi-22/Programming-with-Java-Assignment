class Outer {

    int x = 10;

    class MemberInner {
        void display() {
            System.out.println("Member Inner Class: x = " + x);
        }
    }

    void showLocal() {

        int y = 20;

        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: y = " + y);
            }
        }

        LocalInner obj = new LocalInner();
        obj.display();
    }
}

interface Message {
    void show();
}

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.MemberInner m = outer.new MemberInner();
        m.display();

        outer.showLocal();

        Message msg = new Message() {
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };

        msg.show();
    }
}

