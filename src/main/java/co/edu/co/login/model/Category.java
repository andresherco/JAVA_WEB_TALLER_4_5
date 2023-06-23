package co.edu.co.login.model.beans;

public class Category {
    private Integer category_id;
    private Integer category_name;


    public Category() {
    }

    public Category(Integer category_id, Integer category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getCategory_name() {
        return category_name;
    }

    public void setCategory_name(Integer category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_name=" + category_name +
                '}';
    }


}
