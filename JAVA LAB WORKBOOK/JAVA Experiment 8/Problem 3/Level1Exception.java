class Level1Exception extends Exception {
    public Level1Exception(String s) {
        super(s);
    }
}

class Level2Exception extends Level1Exception {
    public Level2Exception(String s) {
        super(s);
    }
}

class Level3Exception extends Level2Exception {
    public Level3Exception(String s) {
        super(s);
    }
}

class A {
    public void method() throws Level1Exception {
        throw new Level1Exception("Exception thrown from A");
    }
}

class B extends A {
    @Override
    public void method() throws Level2Exception {
        throw new Level2Exception("Exception thrown from B");
    }
}

class C extends B {
    @Override
    public void method() throws Level3Exception {
        throw new Level3Exception("Exception thrown from C");
    }
}
