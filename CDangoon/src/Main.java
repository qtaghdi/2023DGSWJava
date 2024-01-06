public class Main {
    public static void main(String[] args)
    {
        CPeople ancestorF = new CPeople(null,null,"환웅",10);
        CPeople ancestorM = new CPeople(null,null,"웅녀",5);

        CPeople dangun = new CPeople(ancestorF, ancestorM,"단군",50);
        CPeople dangunWife = new CPeople(null,null,"하백의딸",35);

        CPeople dangunSon = new CPeople(dangun, dangunWife,"부루",55);
        dangunSon.mHistory(dangunSon);


    }
}