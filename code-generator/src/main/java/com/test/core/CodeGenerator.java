package com.test.core;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class CodeGenerator {

    public static void function() {
        String url = "jdbc:mysql://localhost:3306/spring_cloud?serverTimezone=Asia/Shanghai&useUnicode=ture&characterEncoding=utf-8";

        System.out.println("请输入要生成到的模块名：");
        Scanner sc = new Scanner(System.in);
        String place = sc.next();
        String pkgPath = System.getProperty("user.dir") + "/" + place + "/src/main/java";
        String pkgXml = System.getProperty("user.dir") + "/" + place + "/src/main/resources/mapper";
        FastAutoGenerator.create(url, "root", "root")
                // 全局配置
                .globalConfig((scanner, builder) ->
                        builder.outputDir(pkgPath)
                                .author(scanner.apply("请输入作者名称:"))
                                .enableSwagger()
                                .fileOverride()
                                .disableOpenDir())
                // 包配置
                .packageConfig((scanner, builder) ->
                        builder.parent(scanner.apply("请输入包名:"))
                                .pathInfo(Collections.singletonMap(OutputFile.xml, pkgXml)))
                // 策略配置
                .strategyConfig((scanner, builder) ->
                        builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔，所有输入 all：")))
                                .addTablePrefix(scanner.apply("请输入要去除的表前缀名"))
                                .controllerBuilder()
                                .enableRestStyle()
                                .enableHyphenStyle()
                                .entityBuilder()
                                .enableLombok()
                                .addTableFills(
                                        new Column("create_time", FieldFill.INSERT),
                                        new Column("update_time", FieldFill.UPDATE)
                                ).build())
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    public static void main(String[] args) {
        function();
    }
}


