/**
 * May 6th, 2021
 * ICS3U1
 * @author Bonny C
 * Multiple Choice Quiz on Colour Theory
 */

public class QuizGame extends javax.swing.JFrame {

    public QuizGame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionPanel2 = new javax.swing.JPanel();
        lblOptionA8 = new javax.swing.JLabel();
        lblOptionA9 = new javax.swing.JLabel();
        lblOptionA10 = new javax.swing.JLabel();
        lblOptionA11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        background = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        qPanel1 = new javax.swing.JPanel();
        lblQ1OptionA = new javax.swing.JLabel();
        lblQ1OptionB = new javax.swing.JLabel();
        lblQ1OptionC = new javax.swing.JLabel();
        lblQ1OptionD = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblSubtitle = new javax.swing.JLabel();
        lbllQuestion1 = new javax.swing.JLabel();
        txtAnswerQ1 = new javax.swing.JTextField();
        qPanel2 = new javax.swing.JPanel();
        lblQ2OptionA = new javax.swing.JLabel();
        lblQ2OptionB = new javax.swing.JLabel();
        lblQ2OptionC = new javax.swing.JLabel();
        lblQ2OptionD = new javax.swing.JLabel();
        txtAnswerQ2 = new javax.swing.JTextField();
        qPanel3 = new javax.swing.JPanel();
        lblQ3OptionA = new javax.swing.JLabel();
        lblQ3OptionB = new javax.swing.JLabel();
        lblQ3OptionC = new javax.swing.JLabel();
        lblQ3OptionD = new javax.swing.JLabel();
        txtAnswerQ3 = new javax.swing.JTextField();
        panelResults = new javax.swing.JPanel();
        panelResultsHeader = new javax.swing.JPanel();
        lblQuizResults = new javax.swing.JLabel();
        lblCorrectMark = new javax.swing.JLabel();
        lblIncorrectMark = new javax.swing.JLabel();
        lblCorrectAns = new javax.swing.JLabel();
        lblIncorrectAns = new javax.swing.JLabel();
        lblPercent = new javax.swing.JLabel();
        txtCorrectCount = new javax.swing.JTextField();
        txtIncorrectCount = new javax.swing.JTextField();
        txtPercentCorrect = new javax.swing.JTextField();
        qPanel4 = new javax.swing.JPanel();
        lblQ4OptionA = new javax.swing.JLabel();
        lblQ4OptionB = new javax.swing.JLabel();
        lblQ4OptionC = new javax.swing.JLabel();
        lblQ4OptionD = new javax.swing.JLabel();
        txtAnswerQ4 = new javax.swing.JTextField();
        qPanel5 = new javax.swing.JPanel();
        lblQ5OptionA = new javax.swing.JLabel();
        lblQ5OptionB = new javax.swing.JLabel();
        lblQ5OptionC = new javax.swing.JLabel();
        lblQ5OptionD = new javax.swing.JLabel();
        txtAnswerQ5 = new javax.swing.JTextField();
        lbllQuestion2 = new javax.swing.JLabel();
        lbllQuestion3 = new javax.swing.JLabel();
        lbllQuestion5 = new javax.swing.JLabel();
        lbllQuestion4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        questionPanel2.setBackground(new java.awt.Color(255, 203, 62));

        lblOptionA8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOptionA8.setForeground(new java.awt.Color(251, 131, 111));
        lblOptionA8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOptionA8.setText("A: ");

        lblOptionA9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOptionA9.setForeground(new java.awt.Color(251, 131, 111));
        lblOptionA9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOptionA9.setText("B: ");

        lblOptionA10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOptionA10.setForeground(new java.awt.Color(251, 131, 111));
        lblOptionA10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOptionA10.setText("C: ");

        lblOptionA11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOptionA11.setForeground(new java.awt.Color(251, 131, 111));
        lblOptionA11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOptionA11.setText("D: ");

        javax.swing.GroupLayout questionPanel2Layout = new javax.swing.GroupLayout(questionPanel2);
        questionPanel2.setLayout(questionPanel2Layout);
        questionPanel2Layout.setHorizontalGroup(
            questionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOptionA8, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(lblOptionA9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOptionA10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOptionA11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        questionPanel2Layout.setVerticalGroup(
            questionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOptionA8)
                .addGap(7, 7, 7)
                .addComponent(lblOptionA9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOptionA10)
                .addGap(11, 11, 11)
                .addComponent(lblOptionA11)
                .addGap(61, 61, 61))
        );

        jTextField3.setBackground(new java.awt.Color(255, 153, 153));
        jTextField3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 51, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(11, 19, 84));

        headerPanel.setBackground(new java.awt.Color(247, 101, 163));

        lblHeader.setBackground(new java.awt.Color(0, 0, 0));
        lblHeader.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(22, 91, 170));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Colour Theory Quiz");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qPanel1.setBackground(new java.awt.Color(22, 91, 170));

        lblQ1OptionA.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ1OptionA.setForeground(new java.awt.Color(255, 164, 182));
        lblQ1OptionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ1OptionA.setText("A: Purple");

        lblQ1OptionB.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ1OptionB.setForeground(new java.awt.Color(255, 164, 182));
        lblQ1OptionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ1OptionB.setText("B: Blue");

        lblQ1OptionC.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ1OptionC.setForeground(new java.awt.Color(255, 164, 182));
        lblQ1OptionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ1OptionC.setText("C: Green");

        lblQ1OptionD.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ1OptionD.setForeground(new java.awt.Color(255, 164, 182));
        lblQ1OptionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ1OptionD.setText("D: Orange");

        javax.swing.GroupLayout qPanel1Layout = new javax.swing.GroupLayout(qPanel1);
        qPanel1.setLayout(qPanel1Layout);
        qPanel1Layout.setHorizontalGroup(
            qPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQ1OptionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ1OptionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ1OptionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ1OptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        qPanel1Layout.setVerticalGroup(
            qPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel1Layout.createSequentialGroup()
                .addComponent(lblQ1OptionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQ1OptionB)
                .addGap(3, 3, 3)
                .addComponent(lblQ1OptionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ1OptionD)
                .addGap(73, 73, 73))
        );

        btnSubmit.setBackground(new java.awt.Color(247, 101, 163));
        btnSubmit.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(11, 19, 84));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblSubtitle.setFont(new java.awt.Font("Ink Free", 1, 23)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 164, 182));
        lblSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitle.setText("Enter the letter of the answer in the blue box");

        lbllQuestion1.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lbllQuestion1.setForeground(new java.awt.Color(247, 101, 163));
        lbllQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllQuestion1.setText("Question 1: What is the complementary colour of red?");

        txtAnswerQ1.setBackground(new java.awt.Color(22, 91, 170));
        txtAnswerQ1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        txtAnswerQ1.setForeground(new java.awt.Color(255, 164, 182));
        txtAnswerQ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswerQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerQ1ActionPerformed(evt);
            }
        });

        qPanel2.setBackground(new java.awt.Color(22, 91, 170));

        lblQ2OptionA.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ2OptionA.setForeground(new java.awt.Color(255, 164, 182));
        lblQ2OptionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ2OptionA.setText("A: Red, blue, yellow");

        lblQ2OptionB.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ2OptionB.setForeground(new java.awt.Color(255, 164, 182));
        lblQ2OptionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ2OptionB.setText("B: Orange, purple, green");

        lblQ2OptionC.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ2OptionC.setForeground(new java.awt.Color(255, 164, 182));
        lblQ2OptionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ2OptionC.setText("C: Red, blue, green");

        lblQ2OptionD.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ2OptionD.setForeground(new java.awt.Color(255, 164, 182));
        lblQ2OptionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ2OptionD.setText("D: Orange, blue, yellow");

        javax.swing.GroupLayout qPanel2Layout = new javax.swing.GroupLayout(qPanel2);
        qPanel2.setLayout(qPanel2Layout);
        qPanel2Layout.setHorizontalGroup(
            qPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQ2OptionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ2OptionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ2OptionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ2OptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        qPanel2Layout.setVerticalGroup(
            qPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel2Layout.createSequentialGroup()
                .addComponent(lblQ2OptionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQ2OptionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ2OptionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ2OptionD)
                .addGap(66, 66, 66))
        );

        txtAnswerQ2.setBackground(new java.awt.Color(22, 91, 170));
        txtAnswerQ2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        txtAnswerQ2.setForeground(new java.awt.Color(255, 164, 182));
        txtAnswerQ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswerQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerQ2ActionPerformed(evt);
            }
        });

        qPanel3.setBackground(new java.awt.Color(22, 91, 170));

        lblQ3OptionA.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ3OptionA.setForeground(new java.awt.Color(255, 164, 182));
        lblQ3OptionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ3OptionA.setText("A: Orange, green, purple");

        lblQ3OptionB.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ3OptionB.setForeground(new java.awt.Color(255, 164, 182));
        lblQ3OptionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ3OptionB.setText("B: Combinations of two primary colours");

        lblQ3OptionC.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ3OptionC.setForeground(new java.awt.Color(255, 164, 182));
        lblQ3OptionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ3OptionC.setText("C: Combinations of two secondary colours");

        lblQ3OptionD.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ3OptionD.setForeground(new java.awt.Color(255, 164, 182));
        lblQ3OptionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ3OptionD.setText("D: Combinations of primary and secondary colours");

        javax.swing.GroupLayout qPanel3Layout = new javax.swing.GroupLayout(qPanel3);
        qPanel3.setLayout(qPanel3Layout);
        qPanel3Layout.setHorizontalGroup(
            qPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qPanel3Layout.createSequentialGroup()
                        .addComponent(lblQ3OptionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(qPanel3Layout.createSequentialGroup()
                        .addGroup(qPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQ3OptionC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQ3OptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(qPanel3Layout.createSequentialGroup()
                        .addComponent(lblQ3OptionB, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        qPanel3Layout.setVerticalGroup(
            qPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel3Layout.createSequentialGroup()
                .addComponent(lblQ3OptionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQ3OptionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ3OptionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ3OptionD)
                .addGap(66, 66, 66))
        );

        txtAnswerQ3.setBackground(new java.awt.Color(22, 91, 170));
        txtAnswerQ3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        txtAnswerQ3.setForeground(new java.awt.Color(255, 164, 182));
        txtAnswerQ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswerQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerQ3ActionPerformed(evt);
            }
        });

        panelResults.setBackground(new java.awt.Color(255, 164, 182));

        panelResultsHeader.setBackground(new java.awt.Color(247, 101, 163));

        lblQuizResults.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblQuizResults.setForeground(new java.awt.Color(22, 91, 170));
        lblQuizResults.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQuizResults.setText("Quiz Results:");

        lblCorrectMark.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lblCorrectMark.setForeground(new java.awt.Color(22, 91, 170));
        lblCorrectMark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorrectMark.setText("Correct Answers = √          ");

        lblIncorrectMark.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lblIncorrectMark.setForeground(new java.awt.Color(22, 91, 170));
        lblIncorrectMark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIncorrectMark.setText("Incorrect Answers = X       ");

        javax.swing.GroupLayout panelResultsHeaderLayout = new javax.swing.GroupLayout(panelResultsHeader);
        panelResultsHeader.setLayout(panelResultsHeaderLayout);
        panelResultsHeaderLayout.setHorizontalGroup(
            panelResultsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultsHeaderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblQuizResults, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelResultsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorrectMark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIncorrectMark, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50))
        );
        panelResultsHeaderLayout.setVerticalGroup(
            panelResultsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultsHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCorrectMark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIncorrectMark)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblQuizResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblCorrectAns.setFont(new java.awt.Font("Ink Free", 1, 22)); // NOI18N
        lblCorrectAns.setForeground(new java.awt.Color(22, 91, 170));
        lblCorrectAns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorrectAns.setText("Number of correct questions answered: ");

        lblIncorrectAns.setFont(new java.awt.Font("Ink Free", 1, 22)); // NOI18N
        lblIncorrectAns.setForeground(new java.awt.Color(22, 91, 170));
        lblIncorrectAns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIncorrectAns.setText("Number of incorrect questions answered: ");

        lblPercent.setFont(new java.awt.Font("Ink Free", 1, 22)); // NOI18N
        lblPercent.setForeground(new java.awt.Color(22, 91, 170));
        lblPercent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPercent.setText("Quiz percentage mark: ");

        txtCorrectCount.setBackground(new java.awt.Color(22, 91, 170));
        txtCorrectCount.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtCorrectCount.setForeground(new java.awt.Color(247, 101, 163));
        txtCorrectCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorrectCount.setText("0");

        txtIncorrectCount.setBackground(new java.awt.Color(22, 91, 170));
        txtIncorrectCount.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtIncorrectCount.setForeground(new java.awt.Color(247, 101, 163));
        txtIncorrectCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIncorrectCount.setText("0");

        txtPercentCorrect.setBackground(new java.awt.Color(22, 91, 170));
        txtPercentCorrect.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtPercentCorrect.setForeground(new java.awt.Color(247, 101, 163));
        txtPercentCorrect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPercentCorrect.setText("0.0%");

        javax.swing.GroupLayout panelResultsLayout = new javax.swing.GroupLayout(panelResults);
        panelResults.setLayout(panelResultsLayout);
        panelResultsLayout.setHorizontalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResultsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorrectAns)
                    .addComponent(lblIncorrectAns)
                    .addComponent(lblPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorrectCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncorrectCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPercentCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultsLayout.setVerticalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultsLayout.createSequentialGroup()
                .addComponent(panelResultsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorrectAns)
                    .addComponent(txtCorrectCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIncorrectCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIncorrectAns))
                .addGap(22, 22, 22)
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPercentCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        qPanel4.setBackground(new java.awt.Color(22, 91, 170));

        lblQ4OptionA.setBackground(new java.awt.Color(22, 91, 170));
        lblQ4OptionA.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ4OptionA.setForeground(new java.awt.Color(255, 164, 182));
        lblQ4OptionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ4OptionA.setText("A: The vividness of a color");

        lblQ4OptionB.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ4OptionB.setForeground(new java.awt.Color(255, 164, 182));
        lblQ4OptionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ4OptionB.setText("B: Scale of lightness to darkness");

        lblQ4OptionC.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ4OptionC.setForeground(new java.awt.Color(255, 164, 182));
        lblQ4OptionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ4OptionC.setText("C: Colour unity");

        lblQ4OptionD.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ4OptionD.setForeground(new java.awt.Color(255, 164, 182));
        lblQ4OptionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ4OptionD.setText("D: Anagalous colours");

        javax.swing.GroupLayout qPanel4Layout = new javax.swing.GroupLayout(qPanel4);
        qPanel4.setLayout(qPanel4Layout);
        qPanel4Layout.setHorizontalGroup(
            qPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQ4OptionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ4OptionB, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(lblQ4OptionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ4OptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        qPanel4Layout.setVerticalGroup(
            qPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel4Layout.createSequentialGroup()
                .addComponent(lblQ4OptionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQ4OptionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ4OptionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ4OptionD)
                .addGap(66, 66, 66))
        );

        txtAnswerQ4.setBackground(new java.awt.Color(22, 91, 170));
        txtAnswerQ4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        txtAnswerQ4.setForeground(new java.awt.Color(255, 164, 182));
        txtAnswerQ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswerQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerQ4ActionPerformed(evt);
            }
        });

        qPanel5.setBackground(new java.awt.Color(22, 91, 170));

        lblQ5OptionA.setBackground(new java.awt.Color(22, 91, 170));
        lblQ5OptionA.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ5OptionA.setForeground(new java.awt.Color(255, 164, 182));
        lblQ5OptionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ5OptionA.setText("A: Dulls the colour");

        lblQ5OptionB.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ5OptionB.setForeground(new java.awt.Color(255, 164, 182));
        lblQ5OptionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ5OptionB.setText("B: Changes the transparency");

        lblQ5OptionC.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ5OptionC.setForeground(new java.awt.Color(255, 164, 182));
        lblQ5OptionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ5OptionC.setText("C: Changes the intensity");

        lblQ5OptionD.setFont(new java.awt.Font("Ink Free", 1, 19)); // NOI18N
        lblQ5OptionD.setForeground(new java.awt.Color(255, 164, 182));
        lblQ5OptionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQ5OptionD.setText("D: Makes a new colour");

        javax.swing.GroupLayout qPanel5Layout = new javax.swing.GroupLayout(qPanel5);
        qPanel5.setLayout(qPanel5Layout);
        qPanel5Layout.setHorizontalGroup(
            qPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQ5OptionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ5OptionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ5OptionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQ5OptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        qPanel5Layout.setVerticalGroup(
            qPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPanel5Layout.createSequentialGroup()
                .addComponent(lblQ5OptionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQ5OptionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ5OptionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQ5OptionD)
                .addGap(66, 66, 66))
        );

        txtAnswerQ5.setBackground(new java.awt.Color(22, 91, 170));
        txtAnswerQ5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        txtAnswerQ5.setForeground(new java.awt.Color(255, 164, 182));
        txtAnswerQ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswerQ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerQ5ActionPerformed(evt);
            }
        });

        lbllQuestion2.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lbllQuestion2.setForeground(new java.awt.Color(247, 101, 163));
        lbllQuestion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllQuestion2.setText("Question 2: What are the three primary colours?");

        lbllQuestion3.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lbllQuestion3.setForeground(new java.awt.Color(247, 101, 163));
        lbllQuestion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllQuestion3.setText("Question 3: What are tertiary colours?");

        lbllQuestion5.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lbllQuestion5.setForeground(new java.awt.Color(247, 101, 163));
        lbllQuestion5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllQuestion5.setText("Question 5: What does saturating a colour do?");

        lbllQuestion4.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        lbllQuestion4.setForeground(new java.awt.Color(247, 101, 163));
        lbllQuestion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllQuestion4.setText("Question 4: What is value?");

        btnExit.setBackground(new java.awt.Color(247, 101, 163));
        btnExit.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(11, 19, 84));
        btnExit.setText("EXIT ");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(247, 101, 163));
        btnRestart.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(11, 19, 84));
        btnRestart.setText("RESTART");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllQuestion2)
                                    .addComponent(lbllQuestion3)
                                    .addComponent(lbllQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnswerQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswerQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswerQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllQuestion5)
                                    .addComponent(lbllQuestion4))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(qPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnswerQ4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                        .addComponent(qPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAnswerQ5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panelResults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbllQuestion1)
                        .addGap(1, 1, 1)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(qPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnswerQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(lbllQuestion2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAnswerQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(lbllQuestion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(panelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAnswerQ4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbllQuestion3)
                            .addComponent(lbllQuestion5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(qPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnswerQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(qPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtAnswerQ5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerQ1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        // Integer variables 
        int totalCorrect = 0; 
        int totalIncorrect = 0;  
        final int totalQuestions = 5;
        double percentCorrect = 0;
        
        // String variables
        String userAnswerQ1;
        String userAnswerQ2;
        String userAnswerQ3;
        String userAnswerQ4;
        String userAnswerQ5;
                    
        // Get answers from user and checks if it's right or wrong
        userAnswerQ1 = (txtAnswerQ1.getText());
        if (userAnswerQ1.equals ("c") || userAnswerQ1.equals ("C")) {
            totalCorrect++;
            txtAnswerQ1.setText(String.valueOf("√")); 
        } else {
            totalIncorrect++;
            txtAnswerQ1.setText(String.valueOf("X")); 
        }
        
        userAnswerQ2 = (txtAnswerQ2.getText());
        if (userAnswerQ2.equals ("a") || userAnswerQ2.equals ("A")) {
            totalCorrect++;
            txtAnswerQ2.setText(String.valueOf("√")); 
        } else {
            totalIncorrect++;
            txtAnswerQ2.setText(String.valueOf("X")); 
        }
        
        userAnswerQ3 = (txtAnswerQ3.getText());
        if (userAnswerQ3.equals ("d") || userAnswerQ3.equals ("D")) {
            totalCorrect++;
            txtAnswerQ3.setText(String.valueOf("√")); 
        } else {
            totalIncorrect++;
            txtAnswerQ3.setText(String.valueOf("X")); 
        }
        
        userAnswerQ4 = (txtAnswerQ4.getText());
        if (userAnswerQ4.equals ("b") || userAnswerQ4.equals ("B")) {
            totalCorrect++;
            txtAnswerQ4.setText(String.valueOf("√")); 
        } else {
            totalIncorrect++;
            txtAnswerQ4.setText(String.valueOf("X")); 
        }
        
        userAnswerQ5 = (txtAnswerQ5.getText());
        if (userAnswerQ5.equals ("c") || userAnswerQ5.equals ("C")) {
            totalCorrect++;
            txtAnswerQ5.setText(String.valueOf("√")); 
        } else {
            totalIncorrect++;
            txtAnswerQ5.setText(String.valueOf("X")); 
        }  
       
        // Calculate quiz percentage
        percentCorrect = ((double)totalCorrect / (double)totalQuestions) * 100; 
       
        // Outputs quiz stats
        txtCorrectCount.setText(String.valueOf(totalCorrect)); 
        txtIncorrectCount.setText(String.valueOf(totalIncorrect)); 
        txtPercentCorrect.setText(String.valueOf(percentCorrect + "%"));             
     
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtAnswerQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerQ2ActionPerformed
  
    }//GEN-LAST:event_txtAnswerQ2ActionPerformed

    private void txtAnswerQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerQ3ActionPerformed

    }//GEN-LAST:event_txtAnswerQ3ActionPerformed

    private void txtAnswerQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerQ4ActionPerformed

    }//GEN-LAST:event_txtAnswerQ4ActionPerformed

    private void txtAnswerQ5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerQ5ActionPerformed

    }//GEN-LAST:event_txtAnswerQ5ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // Exits program 
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
     
        // Set counters back to 0 
        int totalCorrect = 0; 
        int totalIncorrect = 0;  
        int percentCorrect = 0;
        
        // Reset answer boxes to blank
        txtAnswerQ1.setText(String.valueOf(""));
        txtAnswerQ2.setText(String.valueOf(""));
        txtAnswerQ3.setText(String.valueOf(""));
        txtAnswerQ4.setText(String.valueOf(""));
        txtAnswerQ5.setText(String.valueOf(""));
        
        // Set stats to 0
        txtCorrectCount.setText(String.valueOf("0")); 
        txtIncorrectCount.setText(String.valueOf("0")); 
        txtPercentCorrect.setText(String.valueOf("0.0%"));     
        
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel lblCorrectAns;
    private javax.swing.JLabel lblCorrectMark;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIncorrectAns;
    private javax.swing.JLabel lblIncorrectMark;
    private javax.swing.JLabel lblOptionA10;
    private javax.swing.JLabel lblOptionA11;
    private javax.swing.JLabel lblOptionA8;
    private javax.swing.JLabel lblOptionA9;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblQ1OptionA;
    private javax.swing.JLabel lblQ1OptionB;
    private javax.swing.JLabel lblQ1OptionC;
    private javax.swing.JLabel lblQ1OptionD;
    private javax.swing.JLabel lblQ2OptionA;
    private javax.swing.JLabel lblQ2OptionB;
    private javax.swing.JLabel lblQ2OptionC;
    private javax.swing.JLabel lblQ2OptionD;
    private javax.swing.JLabel lblQ3OptionA;
    private javax.swing.JLabel lblQ3OptionB;
    private javax.swing.JLabel lblQ3OptionC;
    private javax.swing.JLabel lblQ3OptionD;
    private javax.swing.JLabel lblQ4OptionA;
    private javax.swing.JLabel lblQ4OptionB;
    private javax.swing.JLabel lblQ4OptionC;
    private javax.swing.JLabel lblQ4OptionD;
    private javax.swing.JLabel lblQ5OptionA;
    private javax.swing.JLabel lblQ5OptionB;
    private javax.swing.JLabel lblQ5OptionC;
    private javax.swing.JLabel lblQ5OptionD;
    private javax.swing.JLabel lblQuizResults;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lbllQuestion1;
    private javax.swing.JLabel lbllQuestion2;
    private javax.swing.JLabel lbllQuestion3;
    private javax.swing.JLabel lbllQuestion4;
    private javax.swing.JLabel lbllQuestion5;
    private javax.swing.JPanel panelResults;
    private javax.swing.JPanel panelResultsHeader;
    private javax.swing.JPanel qPanel1;
    private javax.swing.JPanel qPanel2;
    private javax.swing.JPanel qPanel3;
    private javax.swing.JPanel qPanel4;
    private javax.swing.JPanel qPanel5;
    private javax.swing.JPanel questionPanel2;
    private javax.swing.JTextField txtAnswerQ1;
    private javax.swing.JTextField txtAnswerQ2;
    private javax.swing.JTextField txtAnswerQ3;
    private javax.swing.JTextField txtAnswerQ4;
    private javax.swing.JTextField txtAnswerQ5;
    private javax.swing.JTextField txtCorrectCount;
    private javax.swing.JTextField txtIncorrectCount;
    private javax.swing.JTextField txtPercentCorrect;
    // End of variables declaration//GEN-END:variables
}
