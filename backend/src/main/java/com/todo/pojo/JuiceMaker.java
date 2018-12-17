package com.todo.pojo;

public class JuiceMaker {
    private Blender blender = null;
    private String water;
    private String fruit;
    private String sugar;

    public String makeJuice(){
        blender = new Blender();
        return blender.mix(water , fruit ,sugar);
    }
}
