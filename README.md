<!--suppress HtmlDeprecatedAttribute -->

<div align="center">
  <p>
    <img alt="AF_Banner" src="https://github.com/SuperMonster002/Hello-Sockpuppet/raw/master/auto.js-banner_800×224_transparent.png"/>
  </p>

  <p>Android 平台支持无障碍服务的 JavaScript 自动化工具</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6/releases/latest"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6?color=009688"/></a>
    <a href="https://github.com/mozilla/rhino"><img alt="Rhino" src="https://img.shields.io/badge/engine-rhino%201.7.14-ff69b4"/></a>
    <a href="https://www.codefactor.io/repository/github/SuperMonster003/AutoJs6"><img alt="CodeFactor Grade" src="https://www.codefactor.io/repository/github/SuperMonster003/AutoJs6/badge"/></a>
    <a href="https://lgtm.com/projects/g/SuperMonster003/AutoJs6/?mode=list"><img alt="LGTM Grade" src="https://img.shields.io/lgtm/grade/javascript/github/SuperMonster003/AutoJs6?label=lgtm"/></a>
    <br>
    <a href="https://github.com/SuperMonster003/AutoJs6/commit/ce88d3acb797b180c3f1f15bf77dbba5e934393c"><img alt="Created" src="https://img.shields.io/date/1636632233?color=2e7d32&label=created"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6/find/master"><img alt="GitHub Code Size" src="https://img.shields.io/github/languages/code-size/SuperMonster003/AutoJs6?color=795548"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6/find/master"><img alt="GitHub Code Lines" src="https://img.shields.io/tokei/lines/github/SuperMonster003/AutoJs6?color=37474F"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6?color=534BAE"/></a>
  </p>
</div>

******

### 简介

* Android 平台支持无障碍服务的 JavaScript 自动化工具
* 复刻 (Fork) 自 [hyb1996/Auto.js](https://github.com/hyb1996/Auto.js)

******

### 指南

******

* [项目文档](http://docs.autojs.org)

******

### 功能

******

* 可用作 JavaScript IDE (代码补全/变量重命名/代码格式化)
* 支持基于 [无障碍服务](https://developer.android.com/reference/android/accessibilityservice/AccessibilityService) 的自动化操作
* 支持悬浮窗快捷操作 (脚本录制及运行/查看包名及活动/布局分析)
* 支持选择器 API 并提供控件遍历/获取信息/控件操作 (类似 [UiAutomator](https://developer.android.com/training/testing/ui-automator))
* 支持布局界面分析 (类似 Android Studio 的 LayoutInspector)
* 支持录制功能及录制回放
* 支持屏幕截图/保存截图/图片找色/图片匹配
* 支持 [E4X](https://zh.wikipedia.org/wiki/E4X) (ECMAScript for XML) 编写界面
* 支持将脚本文件或项目打包为 APK 文件
* 支持利用 Root 权限扩展功能 (屏幕点击/滑动/录制/Shell)
* 支持作为 Tasker 插件使用
* 支持与 VSCode 连接并进行桌面开发 (需要 [AutoJs6-VSCode-Ext](https://github.com/SuperMonster003/AutoJs6-VSCode-Ext) 插件)

******

### 主要变更

******

* Rhino 引擎由 [v1.7.7.2](https://github.com/mozilla/rhino/releases/tag/Rhino1_7_7_2_Release) 升级至 [v1.7.14 (SNAPSHOT)](https://github.com/mozilla/rhino/)

    * 支持 [Object.values()](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Object/values)

       ```javascript
       Object.values({name: 'Max', age: 4}); // ['max', 4]
       ```

    * 支持 [Array.prototype.includes()](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/includes)

       ```javascript
       [10, 20, NaN].includes(20); // true
       ```

    * 支持 [BigInt](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/BigInt)

       ```javascript
       typeof 567n === 'bigint'; // true
       ```

    * 支持 [模板字符串](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Template_literals)

       ```javascript
       `Lucky number: ${(Math.random() * 100).toFixed(0)}`
       ```

    * 查看 Rhino 引擎 [更多新特性](https://github.com/SuperMonster003/AutoJs6/blob/master/app/src/main/assets/doc/RHINO.md)

    * 查看 Rhino 引擎 [兼容性列表](https://mozilla.github.io/rhino/compat/engines.html)

******

### 版本历史

******

[comment]: <> "Version history only shows last 3 versions"

# v6.0.1

###### 2022/01/01

* `新增` 连接 VSCode 插件支持客户端 (LAN) 及服务端 (LAN/ADB) 方式 (Ref to Auto.js Pro)
* `新增` 增加 $base64 全局对象 (Ref to Auto.js Pro)
* `新增` 增加 isInteger/isNullish/isPlainObject/isPrimitive/isReference 全局方法
* `新增` 增加 polyfill (Object.getOwnPropertyDescriptors)
* `新增` 增加 polyfill (Array.prototype.flat)
* `优化` 扩展 global.sleep 支持 随机范围/负数兼容
* `优化` 扩展 global.toast 支持 时长控制/强制覆盖控制/dismiss
* `优化` 包名对象全局化 (okhttp3/androidx/de)
* `优化` 升级 Android Material 版本 1.5.0-beta01 -> 1.6.0-alpha01
* `优化` 升级 Android Gradle 插件版本 7.2.0-alpha04 -> 7.2.0-alpha06
* `优化` 升级 Kotlinx Coroutines 版本 1.5.2-native-mt -> 1.6.0-native-mt
* `优化` 升级 Kotlin Gradle 插件版本 1.6.0 -> 1.6.10
* `优化` 升级 Gradle 发行版本 7.3 -> 7.3.3

# v6.0.0

###### 2021/12/01

* `新增` 主页抽屉底部增加重启应用按钮
* `新增` 主页抽屉增加忽略电池优化/显示在其他应用上层等开关
* `修复` 应用初始安装后部分区域主题颜色渲染异常的问题
* `修复` sign.property 不存在时无法 build 的问题
* `修复` 定时任务面板一次性任务的月份存取错误
* `修复` 应用设置页面开关颜色不随主题变更的问题
* `修复` 无法识别打包插件及打包插件下载地址无效的问题
* `修复` 首页抽屉 "查看使用情况权限" 开关状态可能不同步的问题
* `修复` TemplateMatching.fastTemplateMatching 潜在的 Mat 内存泄漏问题
* `优化` 升级 Rhino 引擎版本 1.7.7.2 -> 1.7.13 -> 1.7.14-snapshot
* `优化` 升级 OpenCV 版本 3.4.3 -> 4.5.4
* `优化` ViewUtil.getStatusBarHeight 提升兼容性
* `优化` 主页抽屉移除用户登录相关模块并移除布局占位
* `优化` 主页移除社区及市场标签页面并优化布局对其方式
* `优化` 修改一些设置选项的默认开关状态
* `优化` 关于页面增加 SinceDate 并优化 Copyright 显示
* `优化` 升级 JSON 模块至 2017-06-12 版本并整合 cycle.js
* `优化` 移除 Activity 前置时的自动检查更新功能并移除检查更新相关按钮
* `优化` AppOpsKt#isOpPermissionGranted 内部代码逻辑
* `优化` ResourceMonitor 使用 ReentrantLock 增强安全性 (Ref to TonyJiangWJ)
* `优化` 使用 Maven Central 等仓库替换 JCenter 仓库
* `优化` 抽离并移除重复的本地库文件
* `优化` 本地化 CrashReport 版本 2.6.6
* `优化` 本地化 MutableTheme 版本 1.0.0
* `优化` 附加 Androidx Preference 版本 1.1.1
* `优化` 附加 SwipeRefreshLayout 版本 1.1.0
* `优化` 升级 Android Analytics 版本 7.0.0 -> 13.1.0
* `优化` 升级 Android Annotations 版本 4.5.2 -> 4.8.0
* `优化` 升级 Android Gradle 插件版本 3.2.1 -> 4.1.0 -> 7.0.3 -> 7.2.0-alpha04
* `优化` 升级 Android Job 版本 1.2.6 -> 1.4.2
* `优化` 升级 Android Material 版本 1.1.0-alpha01 -> 1.5.0-beta01
* `优化` 升级 Androidx MultiDex 版本 2.0.0 -> 2.0.1
* `优化` 升级 Apache Commons Lang3 版本 3.6 -> 3.12.0
* `优化` 升级 Appcompat 版本 1.0.2 -> 1.4.0
* `优化` 升级 ButterKnife Gradle 插件版本 9.0.0-rc2 -> 10.2.1 -> 10.2.3
* `优化` 升级 ColorPicker 版本 2.1.5 -> 2.1.7
* `优化` 升级 Espresso Core 版本 3.1.1-alpha01 -> 3.5.0-alpha03
* `优化` 升级 Eventbus 版本 3.0.0 -> 3.2.0
* `优化` 升级 Glide Compiler 版本 4.8.0 -> 4.12.0 -> 4.12.0
* `优化` 升级 Gradle Build Tool 版本 29.0.2 -> 30.0.2
* `优化` 升级 Gradle Compile 版本 28 -> 30 -> 31
* `优化` 升级 Gradle 发行版本 4.10.2 -> 6.5 -> 7.0.2 -> 7.3
* `优化` 升级 Groovy-Json 插件版本 3.0.7 -> 3.0.8
* `优化` 升级 Gson 版本 2.8.2 -> 2.8.9
* `优化` 升级 JavaVersion 版本 1.8 -> 11 -> 16
* `优化` 升级 Joda Time 版本 2.9.9 -> 2.10.13
* `优化` 升级 Junit 版本 4.12 -> 4.13.2
* `优化` 升级 Kotlin Gradle 插件版本 1.3.10 -> 1.4.10 -> 1.6.0
* `优化` 升级 Kotlinx Coroutines 版本 1.0.1 -> 1.5.2-native-mt
* `优化` 升级 Leakcanary 版本 1.6.1 -> 2.7
* `优化` 升级 LicensesDialog 版本 1.8.1 -> 2.2.0
* `优化` 升级 Material Dialogs 版本 0.9.2.3 -> 0.9.6.0
* `优化` 升级 Okhttp3 版本 3.10.0 -> 5.0.0-alpha.2 -> 5.0.0-alpha.3
* `优化` 升级 Reactivex RxJava2 RxAndroid 版本 2.0.1 -> 2.1.1
* `优化` 升级 Reactivex RxJava2 版本 2.1.2 -> 2.2.21
* `优化` 升级 Retrofit2 Converter Gson 版本 2.3.0 -> 2.9.0
* `优化` 升级 Retrofit2 Retrofit 版本 2.3.0 -> 2.9.0
* `优化` 升级 Zip4j 版本 1.3.2 -> 2.9.1

##### 更多版本历史可参阅

* [CHANGELOG.md](https://github.com/SuperMonster003/AutoJs6/blob/master/app/src/main/assets/doc/CHANGELOG.md)

******

### 相关项目

******

* [AutoJs6-VSCode-Ext](https://github.com/SuperMonster003/AutoJs6-VSCode-Ext) { author: [SuperMonster003](https://github.com/SuperMonster003) }
    - `适用于 VSCode 的桌面开发插件 (二次开发项目)`

* [AutoX](https://github.com/kkevsekk1/AutoX) { author: [kkevsekk1](https://github.com/kkevsekk1) }
    - `安卓平台 JavaScript 自动化工具 (二次开发项目)`

[//]: # (* [Auto.js-TypeScript-Declarations]&#40;https://github.com/SuperMonster003/Auto.js-TypeScript-Declarations&#41; { author: [SuperMonster003]&#40;https://github.com/SuperMonster003&#41; })
[//]: # (    - `Auto.js 声明文件 &#40;.d.ts&#41;`)
