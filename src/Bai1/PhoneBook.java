package Bai1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    String name;
    String phone;

    void viewInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}

public class PhoneBook implements Phone {
    ArrayList<User> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {

        User user = new User();
        boolean had = false;
        boolean find = false;
        if (PhoneList.size() > 0) {
            for (User us : PhoneList) {
                if (us.name.equals(name)) {
                    if (!us.phone.contains(phone)) {
                        us.phone = us.phone + ":" + phone;
                        had = true;
                        find = true;
                        break;
                    }
                }
            }
            if (find == false) {
                user.name = name;
                user.phone = phone;
                PhoneList.add(user);
                had = true;
            }
        } else {
            user.name = name;
            user.phone = phone;
            PhoneList.add(user);
            had = true;
        }
        if (had) {
            System.out.println("Them thanh cong!");
        }
    }

    @Override
    public void removePhone(String name) {
        boolean had = false;

        for (User us : PhoneList) {
            if (us.name.equals(name)) {
                PhoneList.remove(us);
                had = true;
                break;
            }
        }
        if (had) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay");
        }

    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean had = false;
        for (User us : PhoneList) {
            if (us.name.equals((name))) {
                us.phone = newphone;
                had = true;
            }
        }
        if (had) {
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Khong tim thay");
        }
    }


    @Override
    public void searchPhone(String name) {
        boolean had = false;
        for (User us : PhoneList) {
            if (us.name.equals((name))) {
                System.out.println("So dien thoai cua nguoi dung " + us.name + "la: " + us.phone);
                had = true;
                break;
            }
        }
        if (!had) {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new NameSort());
        PhoneList.forEach(User::viewInfo);
    }

    class NameSort implements Comparator<User> {
        public int compare(User u1, User u2) {
            return u1.name.compareTo(u2.name);
        }
    }

}



