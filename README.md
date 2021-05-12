# Java Design Pattern

## Design Pattern
設計模式代表了最佳的實踐，設計模式是程式開發人員在開發過程中面臨的一般問題的解決方案。
這些解決方案是眾多程式開發員經過相當長的一段時間的試驗和錯誤總結出來的。

## 能提供什麼幫助❓
為了代碼可重用性、可讀性、可靠性。 設計模式使代碼編寫真正工程化，設計模式是軟件工程的基石脈絡，如同大樓 的結構一樣。
在程序設計中，引入設計模式可以提高代碼的可讀性和程序運行時的可靠性，使程序設計得到規范和統一。

正確使用設計模式能有效提高代碼的可讀性、可重用性、可靠性，編寫符合設計模式良好規範的代碼，不但有利於自身系統的穩定、可靠，還有利於外部系統的對接。

## 設計模式原則
隨著軟件工程不斷的演進，針對不同的需求，新的設計模式不斷被提出來，但設計模式的原則不會變。基於設計模式的原則，我可以使用已有的設計模式，根據產品或專案的開發需求在現有的設計模式基礎上組合、改造或重新設計。

設計模式有7個原則，
### 1. 單一職責
又稱單一功能原則，它規定一個類只有一個職責。如果有多個職責(功能)被設計在這個類中，就違反了單一職責原則。

#### 範例1

```java
/**
 * 方式一的run方法中，違反了單一職責原則，
 * 解決的方案是根據交通工具執行方法不同，分解成不同類即可
 */
public class SingleResponsebility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽車");
        vehicle.run("摩托");
        vehicle.run("飛機");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上跑");
    }
}
```
#### 範例2

```java
/**
 * 方案二遵循單一職責原則
 * 但是這樣做的改動很大，即將類分解，同時修改客戶端
 * 改進：直接修改Vehicle類，改動的程式碼會比較少
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("汽車");
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("輪船");
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("飛機");
    }
}


class Vehicle1{
    public void run(String vehicle){
        System.out.println(vehicle+"在地上跑");
    }
}

class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+"在水上開");
    }
}

class Vehicle3{
    public void run(String vehicle){
        System.out.println(vehicle+"在天上飛");
    }
}
```
#### 範例3

```java
/**
 * 這種修改方法沒有對原來的類做大的修改，只是增加方法
 * 這裡雖然沒有在類這個級別上遵循單一職責原則，但是在方法級別上，仍然遵守這個原則
 */
public class SingleResonsibility3 {
    public static void main(String[] args) {
        Vehicle4 vehicle4 = new Vehicle4();
        vehicle4.run("汽車");
        vehicle4.run2("輪船");
        vehicle4.run3("飛機");
    }
}

class Vehicle4{
    public void run(String vehicle){
        System.out.println(vehicle+"在地上跑");
    }

    public void run2(String vehicle){
        System.out.println(vehicle+"在水上開");
    }

    public void run3(String vehicle) {
        System.out.println(vehicle + "在天上飛");
    }
}
```

> :warning:  **注意事項**
- 降低類的複雜度，一個類只負責一項職責
- 提高類的可讀性、可維護性
- 降低變更引起的風險
- 通常情況下，我們應當遵守單一職責原則，只有邏輯足夠簡單，才可以在程式碼級違反單一職責原則：只有類中方法數量足夠少，可以在方法級別儲存單一職責原則


### 2. 開閉原則
開閉原則就規定程式中的對象(類、模塊、函數等)對擴展開放，對修改封閉，這意味著一個物件允許在不改變其源代碼的前提下改變其行為，該特性在產品化的環境下是特別有價值的。因為改變源代碼需要經過代碼審查、單元測試等過程，以確保產品的使用質量。若遵循這個原則的代碼在擴展時不發生改變，因此不需要經歷上述過程。

#### 範例1

```java
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//這是一個用於繪圖的類
class GraphicEditor {
    //接收Shape時物件，然後根據type，來繪製不同的圖形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("繪製矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("繪製圓形");
    }
}

//Shape類，基類
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
```
> :warning:  **注意事項**
- 這段程式碼的優點是比較好理解，簡單易操作，
  缺點是違反了設計模式的開閉原則，即當我們給類增加新功能的時候，儘量不修改程式碼，或者儘可能少修改程式碼。比如我們這時要新增加一個圖形種類：三角形，我們需要修改的地方較多。
- 改進方案：把Shape類做成抽象類，並提供一個抽象的draw方法，讓子類去實現即可，這樣我們有新的圖形種類時，只需要讓新的圖形類繼承Shape，並實現draw方法即可，`使用方型`的程式碼就不需要修改，滿足了開閉原則。

#### 範例2
```java
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//這是一個用於繪圖的類
class GraphicEditor {
    //接收Shape時物件，然後根據type，來繪製不同的圖形
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape類，基類
abstract class Shape {
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("繪製矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("繪製圓形");
    }
}
```

### 3. 里氏代換原則
是對開閉原則一種補充，規定在任意父類可以出現的地方，子類都一定可以出現。實現開閉原則的關鍵就是抽象化，父類與子類的繼承關係就是抽象化的具體表現，所以里氏代換原則是對實現化的具體步驟規範。
> 🌐科普:它由芭芭拉·利斯科夫（Barbara Liskov）在1994年發表論文並提出以上的Liskov代換原則。

#### 範例1
```java
public class Liskov1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        dog.setRunSpeed(50);
        tiger.setRunSpeed(50);
        System.out.println("路程300公里");
        System.out.println("Dog 花了" + dog.getRunTime(300) + "小時");
        System.out.println("Tiger 花了" + tiger.getRunTime(300) + "小時");
    }
}

class Animal {
    int speed;

    public void setRunSpeed(int speed) {
        this.speed = speed;
    }

    public int getRunTime(int distance) {
        return (distance / speed);
    }
}

class DogRun {
    int speed;

    public void setRunSpeed(int speed) {
        this.speed = speed;
    }

    public int getRunTime(int distance) {
        return (distance / speed);
    }
}

class Dog extends Animal {
}

class Tiger extends Animal {
    public int getRunTime(int distance) {
        return super.speed * distance;
    }
}
```
> :warning:  **注意事項**
- 我們發現原來執行正常的移動距離所花費時間功能發生了錯誤，原因就是類Dog無意中重寫了父類的方法，造成原有功能出現錯誤。在實際程式設計中，我們常常會通過重寫父類的方法完成新的功能，這樣寫起來雖然簡單，但整個繼承體系的複用性會比較差，特別是執行多型比較頻繁的時候。
- 通用的做法是：原來的父類和子類都繼承一個更通俗的基類，原有的繼承關係去掉，採用依賴、聚合、組合等關係替代。

#### 範例2

```java
public class Liskov2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        dog.setRunSpeed(50);
        tiger.setRunSpeed(100);
        System.out.println("路程300公里");
        System.out.println("Dog 花了" + dog.getRunTime(300) + "小時");
        System.out.println("Tiger 花了" + tiger.getRunTime(300) + "小時");
    }
}

class Animal {
    int speed;

    public void eat() {
        System.out.println("動物吃東西！！");
    }
}


class Dog extends Animal {


    public void setRunSpeed(int speed) {
        this.speed = speed;
    }

    public int getRunTime(int distance) {
        return (distance / speed);
    }
}

class Tiger extends Animal {

    public void setRunSpeed(int speed) {
        this.speed = speed;
    }

    public int getRunTime(int distance) {
        return (distance / speed);
    }
}
```

### 4. 依賴倒轉原則
高層模組不應該依賴低層模組，是兩者都應該依賴抽象；而抽象不應該依賴細節，應該是細節應該依賴於抽象，這是依賴反轉原則的目的。不但可以減低類別間的耦合，也提高了系統的可讀性及可維護性。

#### 範例1

```java
public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "電子郵件：Hello World!!!";
    }
}

class Persion {
    public void receive(Email e) {
        System.out.println(e.getInfo());
    }
}
```

> :warning:  **注意事項**
- 如果我們獲取的物件是微信、簡訊等等，則新增類，同時Persion也要增加相應的接收方法
- 解決思路:引入一個抽象的介面IReceiver，表示接收者，這樣Persion類與介面IReceiver發生依賴，因為Email、WeChat等等屬於接收的範圍，它們各自實現IReceiver介面就可以，這樣我們就符合依賴倒轉原則。

#### 範例2

```java
public class DependecyInversion2 {
    public static void main(String[] args) {
        Persion2 persion2 = new Persion2();
        persion2.receive(new Email2());
        persion2.receive(new WeChat());
    }
}

interface IReceiver {
    public String getInfo();
}

class Email2 implements IReceiver {
    @Override
    public String getInfo() {
        return "電子郵件：Hello World!";
    }
}

class WeChat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信訊息：Hello weixin";
    }
}


class Persion2 {
    public void receive(IReceiver i) {
        System.out.println(i.getInfo());
    }
}
```

> :warning:  **注意事項**
- 依賴傳遞3種方式:介面傳遞、構造方法傳遞、setter方法傳遞

#### 介面傳遞

```java
//第一種方式：介面傳遞
//開關的介面
interface IOpenAndClose {
    public void opoen(ITV tv);//抽象方法，接收介面
}

interface ITV {//ITV介面

    public void play();
}

//實現介面
class OpenAndClose implements IOpenAndClose {
    @Override
    public void opoen(ITV tv) {
        tv.play();
    }
}
```

#### 構造方法傳遞

```java
//方式二：構造方法傳遞
interface IOpenAndClose {
    public void open();//抽象方法
}

interface ITV {//ITV介面

    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITV tv;//成員

    public OpenAndClose(ITV tv) {//構造方法
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
```

#### setter方法傳遞

```java
//方式三：setter方法傳遞
interface IOpenAndClose {
    public void open();//抽象方法
}

interface ITV {//ITV介面

    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
```

### 5. 接口隔離原則
客戶端不應該依賴它不需要的介面，即一個類對另一個類的依賴應該建立在最小的介面上。

#### 範例1

```java
public class Segregation1 {
}

//介面
interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B實現了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B實現了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B實現了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B實現了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B實現了operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D實現了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D實現了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D實現了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D實現了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D實現了operation5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }

}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}
```

> :warning:  **注意事項**
- 類A通過介面Interface1依賴類B，類C通過介面Interface1依賴類D，如果介面Interface1對於類A和類C來說不是最小介面，那麼類B和類D必須去實現他們不需要的方法。

#### 範例2
```java
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

//介面
interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B實現了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B實現了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B實現了operation3");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D實現了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D實現了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D實現了operation5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}
```

### 6. 合成/聚合複用原則
合成複用原則就是儘量使用合成/聚合的方式，而不是使用繼承。

#### 聚合 (以班級與學生為例)
在聚合中，部分對象及整體對象兩者的生命週期並沒有關聯，部分對象甚至可能超過整體對象。例如部分對象是學生，而整體對象是班級。一個班級畢業班級就不存在了，但學生依舊繼續存在於另一個整體對象，如大學或是某間公司。學生（部分對象）的生命週期並沒有因為班級（整體對象）結束而跟著結束。

```java
class Clazz {
    public void request(Student student){
        System.out.println("class點名！！");
        student.response();
    }
}

class Student {
    public void response(){
        System.out.println("student喊在！！");
    }
}

public class MyClass {
    public static void main(String args[]) {
      Clazz c = new Clazz();
      Student s = new Student();
      c.request(s);
    }
}
```

#### 合成 (人與器官)
相較於聚合，合成的擁有關係就相對強烈一點。部分對象以及整體對象的生命週期是一致的。如人與他的心臟。如果他人死了，那心臟也跟著停止跳動。相對於聚合，合成擁有較強的關聯性。

```java
class People {
    Heart h = new Heart();
    public void request(){
        System.out.println("people走路！！");
        h.response();
    }
}

class Heart {
    public void response(){
        System.out.println("heart跳一下！！");
    }
}

public class MyClass {
    public static void main(String args[]) {
      People c = new People();
      c.request();
    }
}
```

### 7.迪米特法則 (Law of Demeter)
一個物件應該對其他物件保持最少的瞭解，類與類關係越密切，耦合度越大。
迪米特法則又稱最少知道原則(Principle of Least Knowledge)，即一個類對自己依賴的類知道的越少越好。
也就是說，對於被依賴的類不管多麼複雜，都儘量將邏輯封裝在類的內部。對外除了提供 public方法，不對外洩露任何資訊。
> 🌐科普:得墨忒耳定律，它由美國東北大學在1987年末在發明的。

#### 範例1
```java
//有一個學校，下屬有各個學院和總部，現要求列印出學校總部員工ID和學院員工的id。
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//學校總部員工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//學院員工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理學院員工的類
class CollegeManager {
    //返回學院的所有員工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {//增加了10個員工
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工id=" + i);
            list.add(emp);
        }
        return list;
    }
}

/**
 * 管理學校員工的類
 * 分析：SchoolManager類的直接朋友有哪些？
 * 直接朋友有“Employee”、“CollegeManager”
 * 非直接朋友有“CollegeEmployee”
 * 這就違背了迪米特法則
 */
class SchoolManager {
    //返回學校總部的員工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { //增加了5個員工
            Employee emp = new Employee();
            emp.setId("學校總部員工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //完成輸出學校總部和學院員工資訊的方法
    void printAllEmployee(CollegeManager sub) {
        //獲取學院員工
        //CollegeEmployee是以區域性變數的形式出現在SchoolManager類中
        //解決方案：將獲取學院員工的方法封裝到CollegeManager中
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------學院員工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        //獲取學校總部員工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------學校總部員工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
```

> :warning:  **注意事項**
- 前面設計的問題在於SchoolManager中，CollegeEmployee類並不是SchoolManager類的直接朋友。
- 按照迪米特法則，應該避免出現非直接朋友關係的耦合。

#### 範例2
```java
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//學校總部員工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//學院員工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理學院員工的類
class CollegeManager {
    //返回學院的所有員工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {//增加了10個員工
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工id=" + i);
            list.add(emp);
        }
        return list;
    }

    //獲取學院員工
    public void printEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("------------學院員工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 管理學校員工的類
 * 分析：SchoolManager類的直接朋友有哪些？
 * 直接朋友有“Employee”、“CollegeManager”
 * 非直接朋友有“CollegeEmployee”
 * 這就違背了迪米特法則
 */
class SchoolManager {
    //返回學校總部的員工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { //增加了5個員工
            Employee emp = new Employee();
            emp.setId("學校總部員工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //完成輸出學校總部和學院員工資訊的方法
    void printAllEmployee(CollegeManager sub) {
        //獲取學院員工
        sub.printEmployee();
        //獲取學校總部員工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------學校總部員工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
```

## 23種常見的設計模式
每種模式在現實中都有相應的原理來與之對應，每種模式都描述了一個在我們周圍不斷重複發生的問題， 
以及該問題的核心解決方案，這也是設計模式能被廣泛應用的原因。

| 構建模式 | 結構模式         | 行為模式       |
| :--------- | :-----------: | ----------------: |
| **[Builder (創建者)](./builder/README.md)** | **[Adapter (適配器)](./adapter/README.md)** | ~~**[Chain of Responsibility (職責鏈模式)](./chain/README.md)**~~ |
| **[Factory Method （工廠方法)](./factory-method/README.md)** | **[Bridge (橋接模式)](./adapter/README.md)** | ~~**[Command (命令模式)](./command/README.md)**~~ |
| **[Abstract Factory (抽象工廠)](./abstract-factory/README.md)** | **[Composite (組合模式)](./composite/README.md)** | ~~**[Interpreter (解釋器模式)](./interpreter/README.md)**~~ |
| **[Prototype (原型模式)](./prototype/README.md)** |  **[Decorator (裝飾模式)](./decorator/README.md)** |  ~~**[Iterator (迭代器模式)](./iterator/README.md)**~~ |
| **[Singleton (單例模式)](./singleton/README.md)** | ~~**[Facade (外觀模式)](./facade/README.md)**~~ | ~~**[Mediator (中介者模式)](./mediator/README.md)**~~ |
| | **[Flyweight (享元模式)](./flyweight/README.md)** | ~~**[Memento (備忘錄模式)](./memeno/README.md)**~~ |
| | ~~**[Proxy (代理模式) ](./proxy/README.md)**~~ | ~~**[Observer (觀察者模式)](./observer/README.md)**~~ |
| | | ~~**[State (狀態模式)](./state/README.md)**~~ |
| | | ~~**[Strategy (策略模式)](./strategy/README.md)**~~ |
| | | ~~**[Template Method (模版方法)](./template-method/README.md)**~~ |
| | | ~~**[Visitor (訪問者模式)](./visitor/README.md)**~~ |
