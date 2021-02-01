package friend;

import java.util.Locale;

public class Friend {
    private String name;
    private float money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (money > 1) {
            return String.format(
                    Locale.ENGLISH,
                    "%s ne %.2f Rs udhar liya hua hai!",
                    this.getName(), this.getMoney()
            );
        } else {
            return String.format(
                    Locale.ENGLISH,
                    "thank you !! tum mere acche dost ho",
                    this.getName(), this.getMoney()
            );
        }
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Friend(String name, float money) {
        this.name = name;
        this.money = money;
    }
}

