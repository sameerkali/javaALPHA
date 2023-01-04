package Recursion.practiceSet;

public class towerOfHenoi {
    public static void towerofhenoi (int num, String src, String helper, String dest) {
        if (num == 1) {
            System.out.println("Transfer disk " + num + "from" + src + "to " + dest);
            return;
        }
        towerofhenoi(num-1, src, dest, helper);
        System.out.println("Transfer disk " + num + " from" + src + "to " + dest);
        towerofhenoi(num-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int num = 4;
        towerofhenoi(num, "S", "H", "E");

    }
}

/*1022 steps for 10disks 😐😑😶😮😮😮😮😮😮😮😮😮😮😯*/
