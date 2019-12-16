package my.com.oop.polymorphizm;

public class Child extends Parent {
    int a = 3;               //скрывающее объявление
    int b = ((Parent)this).a;      //громоздкое обращение к родительскому полю
    int c = super.a;          //простое обращение к родительскому полю
    int x = -1;
}
