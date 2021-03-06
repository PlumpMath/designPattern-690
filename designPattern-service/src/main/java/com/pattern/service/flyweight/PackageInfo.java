package com.pattern.service.flyweight;

/**
 *  享元模式
 *  优点：
 *      1、极大的减少内存中对象的数量
 *      2、相同或者相似的对象，在内存中只有一份，提高系统性能
 *      3、外部状态相对独立，不影响内部状态
 *  缺点：
 *      1、模式较复杂，是程序逻辑复杂化
 *      2、为了节省内存，共享了内部状态，分离出外部状态。而读取外部状态，是运行时间变长，用
 *          时间换取空间。
 */
public class PackageInfo {

}
