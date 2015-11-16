/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 * <p>Java class for basic math.
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
public class basicCalc {
    private int IVar1,IVar2,IErg;
    private long LVar1,LVar2,LErg;
    private float FVar1,FVar2,FErg;
    private double DVar1,DVar2,DErg;

/**
 * <p>Basic constructor without initialization of any field
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
    public basicCalc()
    {
        this.IVar1=0;
        this.IVar2=0;
        this.IErg=0;

        this.LVar1=0;
        this.LVar2=0;
        this.LErg=0;

        this.FVar1=0;
        this.FVar2=0;
        this.FErg=0;

        this.DVar1=0;
        this.DVar2=0;
        this.DErg=0;
    }
/**
 * <p>Basic constructor with initialization for integer operations
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
    public basicCalc(int var1, int var2)
    {
        this.IVar1=var1;
        this.IVar2=var2;
        this.IErg=0;

        this.LVar1=0;
        this.LVar2=0;
        this.LErg=0;

        this.FVar1=0;
        this.FVar2=0;
        this.FErg=0;

        this.DVar1=0;
        this.DVar2=0;
        this.DErg=0;
    }
/**
 * <p>Basic constructor with initialization for long operations
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
    public basicCalc(long var1, long var2)
    {
        this.IVar1=0;
        this.IVar2=0;
        this.IErg=0;

        this.LVar1=var1;
        this.LVar2=var2;
        this.LErg=0;

        this.FVar1=0;
        this.FVar2=0;
        this.FErg=0;

        this.DVar1=0;
        this.DVar2=0;
        this.DErg=0;
    }
/**
 * <p>Basic constructor with initialization for float operations
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
    public basicCalc(float var1, float var2)
    {
        this.IVar1=0;
        this.IVar2=0;
        this.IErg=0;

        this.LVar1=0;
        this.LVar2=0;
        this.LErg=0;

        this.FVar1=var1;
        this.FVar2=var2;
        this.FErg=0;

        this.DVar1=0;
        this.DVar2=0;
        this.DErg=0;
    }
/**
 * <p>Basic constructor with initialization for double operations
 * 
 * 
 * <pre>
 *
 * </pre>
 * 
 * 
 */
    public basicCalc(double var1, double var2)
    {
        this.IVar1=0;
        this.IVar2=0;
        this.IErg=0;

        this.LVar1=0;
        this.LVar2=0;
        this.LErg=0;

        this.FVar1=0;
        this.FVar2=0;
        this.FErg=0;

        this.DVar1=var1;
        this.DVar2=var2;
        this.DErg=0;
    }

/**
 * <p>Sets integer input variable 1
 */
    public void set_Var1(int var)
    {
        this.IVar1=var;
    }
/**
 * <p>Sets integer input variable 2
 */
    public void set_Var2(int var)
    {
        this.IVar2=var;
    }
/**
 * <p>Sets long input variable 1
 */
    public void set_Var1(long var)
    {
        this.LVar1=var;
    }
/**
 * <p>Sets long input variable 2
 */
    public void set_Var2(long var)
    {
        this.LVar2=var;
    }
/**
 * <p>Sets float input variable 1
 */
    public void set_Var1(float var)
    {
        this.FVar1=var;
    }
/**
 * <p>Sets float input variable 2
 */
    public void set_Var2(float var)
    {
        this.FVar2=var;
    }
/**
 * <p>Sets double input variable 1
 */
    public void set_Var1(double var)
    {
        this.DVar1=var;
    }
/**
 * <p>Sets double input variable 2
 */
    public void set_Var2(double var)
    {
        this.DVar2=var;
    }

/**
 * <p>returns integer calculation result
 */
    public int get_IErg()
    {
        return this.IErg;
    }
/**
 * <p>returns long calculation result
 */
    public long get_LErg()
    {
        return this.LErg;
    }
/**
 * <p>returns float calculation result
 */
    public float get_FErg()
    {
        return this.FErg;
    }
/**
 * <p>returns double calculation result
 */
    public double get_DErg()
    {
        return this.DErg;
    }

/**
 * <p>adds variable 1 to variable 2
 */
    public void add()
    {
        this.IErg = this.IVar1 + this.IVar2;
        this.LErg = this.LVar1 + this.LVar2;
        this.FErg = this.FVar1 + this.FVar2;
        this.DErg = this.DVar1 + this.DVar2;
    }
/**
 * <p>subtacts variable 2 from variable 1
 */
    public void sub()
    {
        this.IErg = this.IVar1 - this.IVar2;
        this.LErg = this.LVar1 - this.LVar2;
        this.FErg = this.FVar1 - this.FVar2;
        this.DErg = this.DVar1 - this.DVar2;
    }
/**
 * <p>multiplies variable 1 and variable 2
 */
    public void mul()
    {
        this.IErg = this.IVar1 * this.IVar2;
        this.LErg = this.LVar1 * this.LVar2;
        this.FErg = this.FVar1 * this.FVar2;
        this.DErg = this.DVar1 * this.DVar2;
    }
/**
 * <p>divides variable 1 by variable 2
 */
    public void div()
    {
        try
        {
            this.IErg = this.IVar1 / this.IVar2;
        }catch(ArithmeticException ae)
        {
            this.IErg = 0;
        }
        try
        {
            this.LErg = this.LVar1 / this.LVar2;
        }catch(ArithmeticException ae)
        {
            this.LErg = 0L;
        }
        try
        {
            this.FErg = this.FVar1 / this.FVar2;
        }catch(ArithmeticException ae)
        {
            this.FErg = 0.0f;
        }
        try
        {
            this.DErg = this.DVar1 / this.DVar2;
        }catch(ArithmeticException ae)
        {
            this.DErg = 0.0d;
        }
        if (this.FErg != this.FErg) this.FErg=0.0f;
        if (this.DErg != this.DErg) this.DErg=0.0d;
    }
}
