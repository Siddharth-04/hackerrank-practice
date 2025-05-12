class DesignBrowserHistory {
    Stack<String> forwardStack;
    Stack<String> backStack;

    public BrowserHistory(String homepage) {
        forwardStack = new Stack<>();
        backStack = new Stack<>();
        backStack.push(homepage);
    }

    public void visit(String url) {
        backStack.push(url);
        forwardStack.clear();
    }

    public String back(int steps) {
        while(backStack.size() > 1 && steps > 0){
            forwardStack.push(backStack.pop());
            steps--;
        }

        return backStack.peek();
    }

    public String forward(int steps) {
        while(forwardStack.size() > 0 && steps > 0){
            backStack.push(forwardStack.pop());
            steps --;
        }

        return backStack.peek();
    }
}