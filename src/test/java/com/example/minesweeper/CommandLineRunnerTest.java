package com.example.minesweeper;

import org.junit.Assert;
import org.junit.Test;


public class CommandLineRunnerTest {

    @Test
    public void setSizeTest(){


        Assert.assertEquals("Wrong Matrix Size",9, CommandLineRunnerImpl.setMatrixSize(0));

    }


}
