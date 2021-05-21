package com.kyocoolcool.composite.example;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 1:07 PM
 */
public class Invester {
    public static void main(String[] args) {
        Mitac mitac = new Mitac("神通資訊科技", "業界第一領導品牌");
        BU T00 = new BU("雲平台與代理事業群", "業績No1");
        BU G00 = new BU("創新科技事業群", "業績No2");
        BU R00 = new BU("物聯網事業群", "業績No3");
        Division TC8 = new Division("TC8", "專案開發處");
        Division TC5 = new Division("TC5", "技術服務處");
        Division TC3 = new Division("TC3", "應用軟體處");
        Department TCF = new Department("TCF", "應用部");
        Department TCX = new Department("TCX", "專案部");
        Department TCY = new Department("TCY", "開發部");
        mitac.add(T00);
        mitac.add(G00);
        mitac.add(R00);
        T00.Divisions.add(TC8);
        T00.Divisions.add(TC5);
        T00.Divisions.add(TC3);
        TC8.Departments.add(TCF);
        TC8.Departments.add(TCX);
        TC8.Departments.add(TCY);

//       mitac.print();
//        T00.print();
    }
}
