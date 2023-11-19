package streamoperation.streammapping;

import java.util.List;

public class Food {
    private String name;
    private List<String> dishes;

    public Food() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDishes() {
        return this.dishes;
    }

    public void setDishes(List<String> dishes) {
        this.dishes = dishes;
    }

}
