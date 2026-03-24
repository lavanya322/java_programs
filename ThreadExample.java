class GoodMorning extends Thread {
public void  run() {
try{
while(true)
{
System.out.println("keep quite");
Thread.sleep(1000);
}
}catch(Exception e){}
}
}

class Hello extends Thread{
public void run(){
try{
while(true)
{
System.out.println("helllo");
Thread.sleep(2000);
}
}catch(Exception e){}
}
}

class Welcome extends Thread{
public void run(){
try{
while(true)
{
System.out.println("please");
Thread.sleep(3000);
}
}catch(Exception e){}
}
}
class Sai extends Thread{
public void run(){
try{
while(true)
{
System.out.println("sai");
Thread.sleep(4000);
}
}catch(Exception e){}
}
}

public class ThreadExample{
public static void main(String[] args){
GoodMorning t1=new GoodMorning();
Hello t2=new Hello();
Welcome t3=new Welcome();
Sai t4=new Sai();
t1.start();
t2.start();
t3.start();
t4.start();
}
}