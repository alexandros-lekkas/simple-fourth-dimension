
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FourthDimensionUI extends javax.swing.JFrame {

    static Random random = new Random(10);
    static int[][][][] array = {
        {
            {
                {
                    random.nextInt(10), random.nextInt(10)
                },
                {
                    random.nextInt(10), random.nextInt(10)
                }
            },
            {
                {
                    random.nextInt(10), random.nextInt(10)
                },
                {
                    random.nextInt(10), random.nextInt(10)
                }
            }
        },
        {
            {
                {
                    random.nextInt(10), random.nextInt(10)
                },
                {
                    random.nextInt(10), random.nextInt(10)
                }
            },
            {
                {
                    random.nextInt(10), random.nextInt(10)
                },
                {
                    random.nextInt(10), random.nextInt(10)
                }
            }
        },};

    public FourthDimensionUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        interactionPanel = new javax.swing.JPanel();
        outputIndexes = new javax.swing.JButton();
        outputDimensions = new javax.swing.JButton();
        outputCode = new javax.swing.JButton();
        outputCoordinates = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        gmoButton = new javax.swing.JButton();
        outputDirectory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setText("Fourth Dimension");

        subtitleLabel.setText("Only in Chicago");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(subtitleLabel))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(Title)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputIndexes.setText("Output Indexes");
        outputIndexes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputIndexesActionPerformed(evt);
            }
        });

        outputDimensions.setText("Output Dimensions");
        outputDimensions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDimensionsActionPerformed(evt);
            }
        });

        outputCode.setText("Output Code");
        outputCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCodeActionPerformed(evt);
            }
        });

        outputCoordinates.setText("Output 4D Coordinates");
        outputCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCoordinatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interactionPanelLayout = new javax.swing.GroupLayout(interactionPanel);
        interactionPanel.setLayout(interactionPanelLayout);
        interactionPanelLayout.setHorizontalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, interactionPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(outputIndexes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputCode, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        interactionPanelLayout.setVerticalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputIndexes, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(outputDimensions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputCoordinates, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        outputLabel.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        outputLabel.setText("Output:");

        output.setColumns(20);
        output.setRows(5);
        output.setText("By default the 4D array is a 2x2x2x2\n\nMeaning that in every position of the 3D plane there are 2 additional 3d planes");
        jScrollPane1.setViewportView(output);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gmoButton.setText("GMO");
        gmoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmoButtonActionPerformed(evt);
            }
        });

        outputDirectory.setText("Directory");
        outputDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gmoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gmoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(interactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outputDimensionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDimensionsActionPerformed
        output.setText("Dimensions: "
                + array.length + " x "
                + array[0].length + " x "
                + array[0][0].length + " x "
                + array[0][0][0].length);
    }//GEN-LAST:event_outputDimensionsActionPerformed

    private void outputIndexesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputIndexesActionPerformed
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    for (int l = 0; l < array[0][0][0].length; l++) {
                        output.setText(output.getText() + "\n " + array[i][j][k][l] + " = [" + i + "]" + "[" + j + "]" + "[" + k + "]" + "[" + l + "]");
                    }
                }
            }
        }
    }//GEN-LAST:event_outputIndexesActionPerformed

    private void outputCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputCoordinatesActionPerformed
        output.setText(" x  | y | z | w | VALUE" + "\n"
                + "-----------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    for (int l = 0; l < array[0][0][0].length; l++) {
                        output.setText(output.getText() + "\n " + i + " | " + j + " | " + k + " | " + l + " | " + array[i][j][k][l]);
                    }
                }
            }
        }
    }//GEN-LAST:event_outputCoordinatesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        output.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void outputCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputCodeActionPerformed
        output.setText("\n"
                + "import java.util.Random;\n"
                + "import java.io.BufferedReader;\n"
                + "import java.io.FileReader;\n"
                + "import java.io.IOException;\n"
                + "\n"
                + "public class FourthDimensionUI extends javax.swing.JFrame {\n"
                + "\n"
                + "    static Random random = new Random(10);\n"
                + "    static int[][][][] array = {\n"
                + "        {\n"
                + "            {\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                },\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                }\n"
                + "            },\n"
                + "            {\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                },\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                }\n"
                + "            }\n"
                + "        },\n"
                + "        {\n"
                + "            {\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                },\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                }\n"
                + "            },\n"
                + "            {\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                },\n"
                + "                {\n"
                + "                    random.nextInt(10), random.nextInt(10)\n"
                + "                }\n"
                + "            }\n"
                + "        },};\n"
                + "\n"
                + "    public FourthDimensionUI() {\n"
                + "        initComponents();\n"
                + "    }\n"
                + "\n"
                + "    @SuppressWarnings(\"unchecked\")\n"
                + "    // <editor-fold defaultstate=\"collapsed\" desc=\"Generated Code\">                          \n"
                + "    private void initComponents() {\n"
                + "\n"
                + "        topPanel = new javax.swing.JPanel();\n"
                + "        Title = new javax.swing.JLabel();\n"
                + "        subtitleLabel = new javax.swing.JLabel();\n"
                + "        interactionPanel = new javax.swing.JPanel();\n"
                + "        outputIndexes = new javax.swing.JButton();\n"
                + "        outputDimensions = new javax.swing.JButton();\n"
                + "        outputCode = new javax.swing.JButton();\n"
                + "        outputCoordinates = new javax.swing.JButton();\n"
                + "        outputPanel = new javax.swing.JPanel();\n"
                + "        outputLabel = new javax.swing.JLabel();\n"
                + "        jScrollPane1 = new javax.swing.JScrollPane();\n"
                + "        output = new javax.swing.JTextArea();\n"
                + "        jButton1 = new javax.swing.JButton();\n"
                + "        gmoButton = new javax.swing.JButton();\n"
                + "        outputDirectory = new javax.swing.JButton();\n"
                + "\n"
                + "        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);\n"
                + "\n"
                + "        Title.setFont(new java.awt.Font(\"Tahoma\", 0, 24)); // NOI18N\n"
                + "        Title.setText(\"Fourth Dimension\");\n"
                + "\n"
                + "        subtitleLabel.setText(\"Only in Chicago\");\n"
                + "\n"
                + "        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);\n"
                + "        topPanel.setLayout(topPanelLayout);\n"
                + "        topPanelLayout.setHorizontalGroup(\n"
                + "            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(topPanelLayout.createSequentialGroup()\n"
                + "                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "                    .addGroup(topPanelLayout.createSequentialGroup()\n"
                + "                        .addGap(373, 373, 373)\n"
                + "                        .addComponent(subtitleLabel))\n"
                + "                    .addGroup(topPanelLayout.createSequentialGroup()\n"
                + "                        .addGap(319, 319, 319)\n"
                + "                        .addComponent(Title)))\n"
                + "                .addContainerGap(326, Short.MAX_VALUE))\n"
                + "        );\n"
                + "        topPanelLayout.setVerticalGroup(\n"
                + "            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(topPanelLayout.createSequentialGroup()\n"
                + "                .addContainerGap()\n"
                + "                .addComponent(Title)\n"
                + "                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n"
                + "                .addComponent(subtitleLabel)\n"
                + "                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "        );\n"
                + "\n"
                + "        outputIndexes.setText(\"Output Indexes\");\n"
                + "        outputIndexes.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                outputIndexesActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        outputDimensions.setText(\"Output Dimensions\");\n"
                + "        outputDimensions.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                outputDimensionsActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        outputCode.setText(\"Output Code\");\n"
                + "        outputCode.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                outputCodeActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        outputCoordinates.setText(\"Output 4D Coordinates\");\n"
                + "        outputCoordinates.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                outputCoordinatesActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        javax.swing.GroupLayout interactionPanelLayout = new javax.swing.GroupLayout(interactionPanel);\n"
                + "        interactionPanel.setLayout(interactionPanelLayout);\n"
                + "        interactionPanelLayout.setHorizontalGroup(\n"
                + "            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)\n"
                + "            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, interactionPanelLayout.createSequentialGroup()\n"
                + "                .addGap(11, 11, 11)\n"
                + "                .addComponent(outputIndexes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addGap(18, 18, 18)\n"
                + "                .addComponent(outputDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addGap(18, 18, 18)\n"
                + "                .addComponent(outputCode, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addGap(18, 18, 18)\n"
                + "                .addComponent(outputCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "        );\n"
                + "        interactionPanelLayout.setVerticalGroup(\n"
                + "            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interactionPanelLayout.createSequentialGroup()\n"
                + "                .addContainerGap()\n"
                + "                .addGroup(interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)\n"
                + "                    .addComponent(outputIndexes, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)\n"
                + "                    .addComponent(outputDimensions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n"
                + "                    .addComponent(outputCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n"
                + "                    .addComponent(outputCoordinates, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "                .addContainerGap())\n"
                + "        );\n"
                + "\n"
                + "        outputLabel.setFont(new java.awt.Font(\"MS Gothic\", 0, 18)); // NOI18N\n"
                + "        outputLabel.setText(\"Output:\");\n"
                + "\n"
                + "        output.setColumns(20);\n"
                + "        output.setRows(5);\n"
                + "        output.setText(\"By default the 4D array is a 2x2x2x2\\n\\nMeaning that in every position of the 3D plane there are 2 additional 3d planes\");\n"
                + "        jScrollPane1.setViewportView(output);\n"
                + "\n"
                + "        jButton1.setText(\"Clear\");\n"
                + "        jButton1.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                jButton1ActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        gmoButton.setText(\"GMO\");\n"
                + "        gmoButton.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                gmoButtonActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        outputDirectory.setText(\"Directory\");\n"
                + "        outputDirectory.addActionListener(new java.awt.event.ActionListener() {\n"
                + "            public void actionPerformed(java.awt.event.ActionEvent evt) {\n"
                + "                outputDirectoryActionPerformed(evt);\n"
                + "            }\n"
                + "        });\n"
                + "\n"
                + "        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);\n"
                + "        outputPanel.setLayout(outputPanelLayout);\n"
                + "        outputPanelLayout.setHorizontalGroup(\n"
                + "            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(outputPanelLayout.createSequentialGroup()\n"
                + "                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "                    .addComponent(outputLabel)\n"
                + "                    .addGroup(outputPanelLayout.createSequentialGroup()\n"
                + "                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                        .addGap(18, 18, 18)\n"
                + "                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)\n"
                + "                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n"
                + "                            .addComponent(gmoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n"
                + "                            .addComponent(outputDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))\n"
                + "                .addContainerGap(28, Short.MAX_VALUE))\n"
                + "        );\n"
                + "        outputPanelLayout.setVerticalGroup(\n"
                + "            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(outputPanelLayout.createSequentialGroup()\n"
                + "                .addComponent(outputLabel)\n"
                + "                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n"
                + "                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "                    .addGroup(outputPanelLayout.createSequentialGroup()\n"
                + "                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n"
                + "                        .addComponent(outputDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n"
                + "                        .addComponent(gmoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))\n"
                + "                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))\n"
                + "                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "        );\n"
                + "\n"
                + "        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());\n"
                + "        getContentPane().setLayout(layout);\n"
                + "        layout.setHorizontalGroup(\n"
                + "            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(layout.createSequentialGroup()\n"
                + "                .addContainerGap()\n"
                + "                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)\n"
                + "                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n"
                + "                    .addComponent(interactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "        );\n"
                + "        layout.setVerticalGroup(\n"
                + "            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n"
                + "            .addGroup(layout.createSequentialGroup()\n"
                + "                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addGap(18, 18, 18)\n"
                + "                .addComponent(interactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addGap(18, 18, 18)\n"
                + "                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)\n"
                + "                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n"
                + "        );\n"
                + "\n"
                + "        pack();\n"
                + "    }// </editor-fold>                        \n"
                + "\n"
                + "    private void outputDimensionsActionPerformed(java.awt.event.ActionEvent evt) {                                                 \n"
                + "        output.setText(\"Dimensions: \"\n"
                + "                + array.length + \" x \"\n"
                + "                + array[0].length + \" x \"\n"
                + "                + array[0][0].length + \" x \"\n"
                + "                + array[0][0][0].length);\n"
                + "    }                                                \n"
                + "\n"
                + "    private void outputIndexesActionPerformed(java.awt.event.ActionEvent evt) {                                              \n"
                + "        for (int i = 0; i < array.length; i++) {\n"
                + "            for (int j = 0; j < array[0].length; j++) {\n"
                + "                for (int k = 0; k < array[0][0].length; k++) {\n"
                + "                    for (int l = 0; l < array[0][0][0].length; l++) {\n"
                + "                        output.setText(output.getText() + \"\\n \" + array[i][j][k][l] + \" = [\" + i + \"]\" + \"[\" + j + \"]\" + \"[\" + k + \"]\" + \"[\" + l + \"]\");\n"
                + "                    }\n"
                + "                }\n"
                + "            }\n"
                + "        }\n"
                + "    }                                             \n"
                + "\n"
                + "    private void outputCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {                                                  \n"
                + "        output.setText(\" x  | y | z | w | VALUE\" + \"\\n\" +\n"
                + "                       \"-----------------------\");\n"
                + "        for (int i = 0; i < array.length; i++) {\n"
                + "            for (int j = 0; j < array[0].length; j++) {\n"
                + "                for (int k = 0; k < array[0][0].length; k++) {\n"
                + "                    for (int l = 0; l < array[0][0][0].length; l++) {\n"
                + "                        output.setText(output.getText() + \"\\n \" + i + \" | \" + j + \" | \" + k + \" | \" + l + \" | \" + array[i][j][k][l]);\n"
                + "                    }\n"
                + "                }\n"
                + "            }\n"
                + "        }\n"
                + "    }                                                 \n"
                + "\n"
                + "    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         \n"
                + "        output.setText(\"\");\n"
                + "    }                                        \n"
                + "\n"
                + "    private void outputCodeActionPerformed(java.awt.event.ActionEvent evt) {                                           \n"
                + "        output.setText(\"\");\n"
                + "        try {\n"
                + "            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty(\"user.dir\") + \"\\\\src\\\\FourthDimensionUI.java\"));\n"
                + "            String line = null;\n"
                + "            while ((line = reader.readLine()) != null) {\n"
                + "                output.setText(output.getText() + \"\\n\" + line);\n"
                + "            }\n"
                + "            reader.close();\n"
                + "        } catch (IOException e) {\n"
                + "            output.setText(\"An error occurred while reading the code: \" + e.getMessage());\n"
                + "        }\n"
                + "    }                                          \n"
                + "\n"
                + "    private void gmoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          \n"
                + "        output.setText(\"my bad\");\n"
                + "    }                                         \n"
                + "\n"
                + "    private void outputDirectoryActionPerformed(java.awt.event.ActionEvent evt) {                                                \n"
                + "        output.setText(\"Current directory: \" + System.getProperty(\"user.dir\"));\n"
                + "    }                                               \n"
                + "\n"
                + "    public static void main(String args[]) {\n"
                + "        java.awt.EventQueue.invokeLater(new Runnable() {\n"
                + "            public void run() {\n"
                + "                new FourthDimensionUI().setVisible(true);\n"
                + "            }\n"
                + "        });\n"
                + "    }\n"
                + "\n"
                + "    // Variables declaration - do not modify                     \n"
                + "    private javax.swing.JLabel Title;\n"
                + "    private javax.swing.JButton gmoButton;\n"
                + "    private javax.swing.JPanel interactionPanel;\n"
                + "    private javax.swing.JButton jButton1;\n"
                + "    private javax.swing.JScrollPane jScrollPane1;\n"
                + "    private javax.swing.JTextArea output;\n"
                + "    private javax.swing.JButton outputCode;\n"
                + "    private javax.swing.JButton outputCoordinates;\n"
                + "    private javax.swing.JButton outputDimensions;\n"
                + "    private javax.swing.JButton outputDirectory;\n"
                + "    private javax.swing.JButton outputIndexes;\n"
                + "    private javax.swing.JLabel outputLabel;\n"
                + "    private javax.swing.JPanel outputPanel;\n"
                + "    private javax.swing.JLabel subtitleLabel;\n"
                + "    private javax.swing.JPanel topPanel;\n"
                + "    // End of variables declaration                   \n"
        );
    }//GEN-LAST:event_outputCodeActionPerformed

    private void gmoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmoButtonActionPerformed
        output.setText("my bad");
    }//GEN-LAST:event_gmoButtonActionPerformed

    private void outputDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDirectoryActionPerformed
        output.setText("Current directory: " + System.getProperty("user.dir"));
    }//GEN-LAST:event_outputDirectoryActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FourthDimensionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton gmoButton;
    private javax.swing.JPanel interactionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JButton outputCode;
    private javax.swing.JButton outputCoordinates;
    private javax.swing.JButton outputDimensions;
    private javax.swing.JButton outputDirectory;
    private javax.swing.JButton outputIndexes;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
