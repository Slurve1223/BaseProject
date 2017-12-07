package com.github.Sl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class lalaTestTest {
    @Test
    public void getType() throws Exception {
        // Arrange準備
        -        Triangle triangle = new Triangle(5, 5, 5);
        +        Triangle triangle = new Triangle(5, 10, 5);

        // Act 動作
        String result = triangle.getType();

        // Assert驗證回傳值
        -        Assert.assertEquals("正三角形", result);
        +        Assert.assertEquals("不是三角形", result);
    }

}
