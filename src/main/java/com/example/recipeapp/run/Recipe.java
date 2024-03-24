package com.example.recipeapp.run;

import com.example.recipeapp.run.Ingredient;

import java.util.List;
import java.util.stream.Collectors;

public class Recipe {

    public Integer id;
    private String name;
    private String image;
    private List<String> category;
    private String instructions;
    private double time;
    private List<Ingredient> ingredients;

    public Recipe() {
    }


    public Recipe(Integer id, String image, String name, List<String> category, String instructions, double time, List<Ingredient> ingredients) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.category = category;
        this.instructions = instructions;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getCategory() {
        return category;
    }

    public String getInstructions() {
        return instructions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getTime() { return time; }

    public Integer getId() {
        return id;
    }

    public String getImage() { return image; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "Recipe{" +
                "id=" + id + "\n" +
                ", image='" + image + '\'' + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", category=" + category + "\n" +
                ", instructions='" + instructions + '\'' + "\n" +
                ", ingredients=" + ingredients.stream().map( Ingredient::toString).collect(Collectors.joining(", ")) + "\n" +
                ", time=" + time + "\n" +
                '}';
    }
}