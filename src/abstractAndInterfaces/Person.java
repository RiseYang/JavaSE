package abstractAndInterfaces;
/**
 * 抽象类和继承的使用
 * @author yang
 *
 */
abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //say的方法
    public void say() {
        System.out.println(this.getContent());
    }

    public abstract String getContent();

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    class Student extends Person {
        private String school;

        public Student(String name, int age, String school) {
            super(name, age);
            this.school = school;
        }

        @Override
        public String getContent() {
            return this.toString();
        }

        public String toString() {
            return "姓名：" + super.getName() + "，年龄：" + super.getAge() + "学校：" + this.school;
        }
    }

    ;

    static class Worker extends Person {
        private String job;

        public Worker(String name, int age, String job) {
            super(name, age);
            this.job = job;
        }

        @Override
        public String getContent() {
            return this.toString();
        }

        public String toString() {
            return "姓名：" + super.getName() + "，年龄：" + super.getAge() + "工作：" + this.job;
        }
    }

    ;

}
