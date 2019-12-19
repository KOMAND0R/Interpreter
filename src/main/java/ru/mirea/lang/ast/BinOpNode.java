package ru.mirea.lang.ast;

import ru.mirea.lang.Token;

public class BinOpNode extends ExprNode {

    public final Token op;
    public final ExprNode left;
    public final ExprNode right;

    public BinOpNode(Token op, ExprNode left, ExprNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + op.text + right.toString() + ")";
    }
}
