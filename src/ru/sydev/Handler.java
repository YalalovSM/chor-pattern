package ru.sydev;

public abstract class Handler {
    private Handler next;

    public abstract boolean check(final String str);

    protected boolean checkNext(final String str) {
        if (next == null) {
            return true;
        }

        return next.check(str);
    }

    public Handler linkWith(Handler next) {
        this.next = next;
        return next;
    }
}
