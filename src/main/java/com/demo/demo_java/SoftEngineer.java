package com.demo.demo_java;

public class SoftEngineer {
    private Integer id;
    private String Name;
    private String techStack;

    public SoftEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.Name = name;
        this.techStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        result = prime * result + ((techStack == null) ? 0 : techStack.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SoftEngineer other = (SoftEngineer) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        if (techStack == null) {
            if (other.techStack != null)
                return false;
        } else if (!techStack.equals(other.techStack))
            return false;
        return true;
    }

}
