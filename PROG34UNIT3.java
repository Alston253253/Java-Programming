interface OuterInterface {
    void show();

    interface NestedInterface {
        void msg();
    }
}

class Implementation implements OuterInterface.NestedInterface {
    @Override
    public void msg() {
        System.out.println("Inside Nested Interface method execution");
    }
}

public class Main {
    public static void main(String[] args) {
        OuterInterface.NestedInterface obj = new Implementation();
        obj.msg();
    }
}