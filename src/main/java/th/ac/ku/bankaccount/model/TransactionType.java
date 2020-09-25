package th.ac.ku.bankaccount.model;

public enum TransactionType {
        Deposit("Deposit"),
        Withdraw("Withdraw");

        private String text;

        public String getText() {
                return text;
        }

        private TransactionType(String transactionTypeString) {
                text = transactionTypeString;
        }
}
