package chapter9;

public class Person {
    String name;
    private int age;
    private String gender;

    public String getName (){   /*metoda sa returnam numele*/
        return name;
    }
    public void setName (String name){ /*face name din variabila locala in variabila globala*/
        this.name = name;
    }
    public int getAge (){ /*metoda sa returnam varsta*/
        return age;
    }
    public void setAge (int age){  /*face varsta din variabila locala in variabila globala*/
        this.age = age;
    }
    public String getGender (){/*metoda care returneaza sexul*/
        return gender;
    }
    public void setGender (String gender){/*face sex din variabila locala in variabila globala*/
        this.gender = gender;
    }
}
