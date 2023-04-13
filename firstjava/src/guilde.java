public class guilde {
    public static void main(String[] args){
        /* /59/ textfield
         * 
         */
        /* /58/ JOptionPane = pop up a standard dialog box that prompts users for a value
                              or informs them of sth
         * 
         * import javax.swing.JOptionPane;
         * main:
         * // dùng để thông báo
         * JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE); //(null,content of dialog,title,type of message)
           JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
           JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
           JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
           JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);
           // dùng để hỏi yes-no
           JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
           System.out.println(JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION)); //yes -> 0 , no -> 1, cancel -> 2, close -> -1 
           // dùng để hỏi cho ng dùng có thể type
           String name = JOptionPane.showInputDialog(null, "What is ur name");
           System.out.println("hello"+name); -> hello ...
           // tổng hợp đống trên
           String[] response = {"You arenot awesome","thank you","\'blush"};
           ImageIcon icon = new ImageIcon("images.png");
           JOptionPane.showOptionDialog(null, "You are awesome!", "secret message",JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.INFORMATION_MESSAGE , icon, response, 0) //(null,title,optionType,messageType,icon,options,initialValue); //chua hiu initialValue

         *
         *  
         */
        /* /57/ open a new GUI window
         * import java.awt.event.ActionEvent;
         * import java.awt.event.ActionListener;
         * import javax.swing.JButton;
         * import javax.swing.JFrame;
         * public class LaunchPage{
              JFrame frame = new JFrame();
              JButton myButton = new JButton("New Window");
              LaunchPage(){
                myButton.setBounds(100,160,200,40);
                myButton.setFocusable(false);
                myButton.addActionListener(this);

                frame.add(myButton);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);

              }
              public void actionPerformed(ActionEvent e) {
                if(e.getSource()==myButton){
                    frame.dispose(); //close frame
                    NewWindow myWindow = new NewWindow();
                }
              }
         * }
         * import java.awt.Font;
         * import javax.swing.JFrame;
         * import javax.swing.JLabel;
         * public class NewWindow{
              JFrame frame = new JFrame();
              JLabel label = new JLabel("Hello!");
              NewWindow(){
                label.setBounds(0,0,100,50);
                label.setFont(new Font(null,Font.PLAIN,25));

                frame.add(label);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);              
              }
         * }
         * main:
         *    LaunchPage launchPage = new LaunchPage;
         * 
         * 
         */
        /* /56/ LayeredPane = Swing container that provides a
                              third dimension for positioning components
                              ex. depth, Z-index
         * 
         * import javax.swing.*;
         * import java.awt.*;
         * main:
            JLabel label1 = new JLabel();
            label1.setOpaque(true);
            label1.setBackground(Color.red);
            label1.setBounds(50,50,200,200);

            JLabel label2 = new JLabel();
            label2.setOpaque(true);
            label2.setBackground(Color.green);
            label2.setBounds(100,100,200,200);

            JLabel label3 = new JLabel();
            label3.setOpaque(true);
            label3.setBackground(Color.blue);
            label3.setBounds(150,150,200,200);

            JLayeredPane layeredPane = new JLayeredPane();
            layeredPane.setBounds(0,0,500,500);
            
            layeredPane.add(label1); //cái nào được add trước thì nó sẽ nằm trên
            layeredPane.add(label2);
            layeredPane.add(label3);
            //thứ tự từ trên xuống: Drag -> PopUp -> Modal -> Palette -> Default
            layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
            layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
            layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
            // dùng số - số càng lớn thì nó sẽ càng được xếp trên
            layeredPane.add(label1, Integer.valueOf(0));
            layeredPane.add(label2, Integer.valueOf(1));
            layeredPane.add(label3, Integer.valueOf(2));            

            JFrame frame = new JFrame("JLayeredPane");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(null);
            


            frame.setVisible(true);

         */
        /* /55/ GridLayout
         * Layout manager = Defines the natural layout for components within a container
         * GridLayout = places components in a grid of cells
         *              Each components takes all the available space within its cell
         *              and each cell is the same size
         * import java.awt.GridLayout;
         * import javax.swing.JButton;
         * import javax.swing.JFrame;
         * main:
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(9,1,10,10)); // 9 rows , 1 column , 10 , 10 khoảng cách giữa các components
            // nếu số lượng vượt quá số ô chia thì nó sẽ tự tạo thêm như có 10 button mà có 3 rows 3 columns thì nó tạo thêm 1 column
            JButton button1 = new JButton("1");
            frame.add(button1);
            // tương đương
            frame.add(new JButton("1"));
            frame.add(new JButton("2"));
            frame.add(new JButton("3"));
            frame.add(new JButton("4"));
            frame.add(new JButton("5"));
            frame.add(new JButton("6"));
            frame.add(new JButton("7"));
            frame.add(new JButton("8"));
            frame.add(new JButton("9"));

            frame.setVisible(true);
         * 
         */
        /* /54/ FlowLayout
         * Layout Manager = Defines the natural layout for components within a container
         * FlowLayout = places components in a row, sized at their preferred size.
         *              If the horizontal space in the container is too small,
         *              the FlowLayout class uses the next available row
         * import java.awt.Color;
         * import java.awt.Dimension;
         * import javax.swing.JPanel;
         * import java.awt.FlowLayout;
         * import javax.swing.JButton;
         * import javax.swing.JFrame;
         * main:
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new FlowLayout()); //or new FlowLayout(FlowLayout.LEADING,10,10) or .CENTER // số 10,10 có nghĩa là khoảng cách giữa các components
            
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(250,250));
            panel.setBackground(Color.lightGray);
            panel.setLayout(new FlowLayout());

            panel.add(new JButton("1")); //quick way to add new button
            panel.add(new JButton("2"));
            panel.add(new JButton("3"));
            panel.add(new JButton("4"));
            panel.add(new JButton("5"));
            panel.add(new JButton("6"));
            panel.add(new JButton("7"));
            panel.add(new JButton("8"));
            panel.add(new JButton("9"));
            

            frame.add(panel);
            frame.setVisible(true);
         * 
         */
        /* /53/ BorderLayout
         * //Layout Manager = Defines the natural layout for components within a container
         * // 3 common managers
         * // BorderLayout = A BorderLayout places components in 5 areas: NORTH,SOUTH,WEST,EAST,CENTER
         *                   All extra space is placed in the center area
         * import java.awt.BorderLayout;
         * import javax.swing.JFrame;
         * import javax.swing.JPanel;
         * import java.awt.Color;
         * import java.awt.Dimension;
         * main:
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new BorderLayout()); //for frame: it gonna do anything but for label or panel or other container, it will execute
            // it can set as new BorderLayout(10,10) //  means that sẽ có khoảng cách giữa các panel
            frame.setVisible(true);

            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();

            panel1.setBackground(Color.red);
            panel2.setBackground(Color.green);
            panel3.setBackground(Color.yellow);
            panel4.setBackground(Color.magenta);
            panel5.setBackground(Color.blue);

            //---------------- sub panels -------------------
            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();
            JPanel panel10 = new JPanel();

            panel6.setBackground(Color.black);
            panel7.setBackground(Color.darkGray);
            panel8.setBackground(Color.gray);
            panel9.setBackground(Color.lightGray);
            panel10.setBackground(Color.white);

            panel5.setLayout(new BorderLayout());

            panel6.setPreferredSize(new Dimension(50,50));
            panel7.setPreferredSize(new Dimension(50,50));
            panel8.setPreferredSize(new Dimension(50,50));
            panel9.setPreferredSize(new Dimension(50,50));
            panel10.setPreferredSize(new Dimension(50,50));

            panel5.add(panel6,BorderLayout.NORTH);
            panel5.add(panel7,BorderLayout.WEST);
            panel5.add(panel8,BorderLayout.EAST);
            panel5.add(panel9,BorderLayout.SOUTH);
            panel5.add(panel10,BorderLayout.CENTER);
            //---------------- sub panels -------------------
            
            frame.add(panel1,BorderLayout.NORTH);
            frame.add(panel2,BorderLayout.WEST);
            frame.add(panel3,BorderLayout.EAST);
            frame.add(panel4,BorderLayout.SOUTH);
            frame.add(panel5,BorderLayout.CENTER);

         */
        /* /52/ buttons
         * //JButton = a button that performs an action when clicked on
         * import java.awt.event.ActionListener;
         * import java.awt.Font;
         * import java.awt.Color;
         * import javax.swing.BorderFactory;
         * import javax.swing.JLabel;
         * import javax.swing.JButton;
         * import javax.swing.JFrame;
         * import javax.swing.ImageIcon;
         * public class MyFrame extends JFrame implements ActionListener{
              JButton button;
              public MyFrame(){
                  ImageIcon icon = new ImageIcon("images.png");
                  ImageIcon icon2 = new ImageIcon("face.png");

                  label = new JLabel();
                  label.setIcon(icon2);
                  label.setBounds(150,250,150,150);
                  label.setVisible(false);

                  button = new JButton();
                  button.setBounds(100,100,250,100);
                  button.addActionListener(this); //add function of actionPerformed to button
                  button.setText("I'm a button");
                  button.setFocusable(false); //set to delete the frame around the text
                  button.setIcon(icon);
                  button.setHorizontalTextPosition(JButton.CENTER);
                  button.setVerticalTextPosition(JButton.BOTTOM);
                  button.setFont(new Font("Comic Sans",Font.BOLD,25));
                  button.setIconTextGap(-50);
                  button.setForeground(Color.cyan); //set font color of text
                  button.setBackground(Color.lightGray);
                  button.setBorder(BorderFactory.createEtchedBorder()); //set viền của button //tao viền 3D



                  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  this.setLayout(null);
                  this.setSize(500,500);
                  this.setVisible(true);
                  this.add(button);
                  this.add(label);
              }
              public void actionPerformed(ActionEvent e){ //auto-generated for ActionListener
                  if(e.getSource()==button){
                    System.out.println("poo");
                    button.setEnabled(false); // hàm thực hiện khiến button chỉ được bấm 1 lần xong ẩn
                    label.setVisible(true);
                  }
              }
            }
         * //advanced shortcut
         * public class MyFrame extends JFrame{
              JButton button;
              public MyFrame(){
                  button = new JButton();
                  button.setBounds(200,100,100,50);
                  button.addActionListener(e -> System.out.println("poo")); //more advanced //add function of actionPerformed to button

                  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  this.setLayout(null);
                  this.setSize(500,500);
                  this.setVisible(true);
                  this.add(button);
              }
           }
         * main:
         * MyFrame frame = new MyFrame(); 
         * 
         */
        /* /51/ panels
         * //JPanel = a GUI component that functions as a container tp hold other components
         * 
         * import javax.swing.JPanel;
         * import java.awt.Color;
         * import javax.swing.JFrame;
         * 
         * main:
         * 
         * ImageIcon icon = new ImageIcon("images.png");
         * 
         * JLabel label = new JLabel();
         * label.setText("Hi");
         * label.setIcon(icon);
         * label.setVerticalAlignment(JLabel.TOP); //dùng khi sử dụng LayoutManager
         * label.setHorizontalAlignment(JLabel.RIGHT); //dùng khi sử dụng LayoutManager
         * label.setBoundS(100,100,75,75);//dùng khi setLayout(null)
         * 
         * JPanel redPanel = new JPanel();
         * redPanel.setBackground(Color.red);
         * redPanel.setBounds(0,0,250,250);
         * redPanel.setLayout(null);
         * 
         * JPanel bluePanel = new JPanel();
         * bluePanel.setBackground(Color.blue);
         * bluePanel.setBounds(250,0,250,250);
         * bluePanel.setLayout(null);
         * 
         * JPanel greenPanel = new JPanel();
         * greenPanel.setBackground(Color.green);
         * greenPanel.setBounds(0,250,500,500);
         * greenPanel.setLayout(null);
         * 
         * 
         * JFrame frame = new JFrame();
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setLayout(null);
         * frame.setSize(750, 750);
         * frame.setVisible(true);
         * bluePanel.add(label);
         * frame.add(redPanel);
         * frame.add(bluePanel);
         * frame.add(greenPanel);
         * 
         * 
         */
        /* /50/ labels
         * JLabel = a GUI display area for a string of text, an image, or both
         * import java.awt.Color;
         * import javax.swing.ImageIcon;
         * import javax.swing.JLabel;
         * import javax.swing.JFrame;
         * import javax.swing.border.Border;
         * main:
         * 
         * ImageIcon image = new ImageIcon("images.png");
         * Border border = BorderFactory.createLineBorder(Color.green,3);
         * 
         * JLabel label = new JLabel(); //create a label 
         * 
         * label.setText("Bro, do you even code?"); //set text of label //tương đương JLabel label = new JLabel("Bro, do you even code?")
         * label.setIcon(image);
         * label.setHorizontalTextPosition(JLabel.CENTER); //or JLabel.LEFT or JLabel.RIGHT //set text LEFT,CENTER,RIGHT of an imageicon
         * label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
         * label.setForeground(Color.green); //set font color of text
         * label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
         * label.setIconTextGap(100); //set gap of text to image
         * label.setBackground(Color.black); //set background color
         * label.setOpaque(true); //display background color
         * label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
         * label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
         * label.setBounds(0, 0, 250, 250); //set x,y position within frame as well as dimension (also size of label)
         * 
         * JFrame frame = new JFrame();
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setSize(500, 500);
         * frame.setLayout(null); //có layout để có thể chỉnh vị trí và kích thước của label
         * frame.setVisible(true);
         * frame.add(label); //default put the content on the left hand side
         * frame.pack(); //trick //nó sẽ chỉnh kích thước của frame vừa cái các component of label đã add
         * 
         */
        /* /49/ GUI
         * //JFrame = a GUI window to add components to
         * import java.awt.Color
         * import javax.swing.JFrame
         * import javax.swing.ImageIcon
         * main:
         * JFrame frame = new JFrame(); //create a frame //need to import javax.swing.JFrame
         * frame.setTitle("JFrame title goes here"); //set title of frame
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exist out of application // setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE) đây là mặc định or dùng JFrame.DO_NOTHING_ON_CLOSE
         * frame.setSize(420,420); //set the x- and y- dimension of frame //we can resize the frame
         * frame.setResizable(false); // prevent frame from resize
         * 
         * ImageIcon image = new ImageIcon("Image.png") //"Image.png" is a name of file //need to import javax.swing.ImageIcon //create ImageIcon
         * frame.setIconImage(image.getImage()); //change icon of frame
         * frame.getContentPane().setBackground(Color.green); //need to import java.awt.Color //change color of background
         * // hoặc
         * frame.getContentPane().setBackground(new Color(0,0,0)); //set RGB color //or new Color(0xFFFFFF) or new Color(0x123456) for heximal color 
         * frame.setVisible(true); //make frame visible
         * 
         * //cách khác là tạo subclass của JFrame
         * public class MyFrame extends JFrame{
         *    public MyFrame{
         *    this.setTitle("JFrame title goes here");
         *    ..... //tương tự
         *    }
         * }
         * main:
         * MyFrame myFrame = new MyFrame(); //if u want to change some statistic, use this way
         * or
         * new MyFrame(); //if u want to display, just do like this
         * 
         */
        /* /48/ audio
         * import java.io.File; //khai báo file
         * import java.io.IOException;
         * import java.util.Scanner;
         * import javax.sound.sampled.*; //phù hợp với file wav nhưng ko với mp3 file
         * main:
         * public static void main(String[] args) throws UnsupportedAudioException, IOException, LineUnavailableException{
         * Scanner scanner = new Scanner(System.in);
         * File file = new File("chillin39-20915.wav");
         * AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); //auto-generated the throws
         * Clip clip = AudioSystem.getClip;
         * clip.open(audioStream); //auto-generated throws LineUnavailableException
         * 
         * clip.start(); //phải để ctr chạy thì mới nghe được tiếng nhạc
         * String response = scanner.next();
         * }
         * // kiểu khác
         * main:
         * public static void main(String[] args) throws UnsupportedAudioException, IOException, LineUnavailableException{
         * Scanner scanner = new Scanner(System.in);
         * File file = new File("chillin39-20915.wav");
         * AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); //auto-generated the throws
         * Clip clip = AudioSystem.getClip;
         * clip.open(audioStream); //auto-generated throws LineUnavailableException
         * String response = "";
         * 
         * while(!response.equals("Q")){
         *    System.out.println("P = play, S = stop, R = reset, Q = quit");
         *    System.out.println("enter choice");
         *    response = scanner.next();
         *    response = response.toUpperCase();
         *    switch(response){
         *        case ("P"): clip.start();
         *        break;
         *        case ("S"): clip.stop();
         *        break;
         *        case ("R"): clip.setMicrosecondPosition(0);
         *        break;
         *        case ("Q"): clip.close();
         *        break;
         *        default: System.out.println("Not a valid response");
         *    }
         * }
         * 
         * 
         */
        /* /47/ FileReader (read a file)
         * // FileReader = read the contents of a file as a stream of characters. One by one
         *                 read() return an int value which contains the byte value
         *                 when read() return -1, there is no more data to be read
         * import java.io.FileReader;
         * main:
         * try {
         * FileReader reader = new FileReader("art.txt"); //create art.txt first
         * int data = reader.read();
         * while (data != -1){
         *    System.out.print((char)data);
         *    data = reader.read();
         * }
         * reader.close();
         * } catch (FileNotFoundException e) { //auto-generated for FileReader
         *    e.printStackTrace();
         * } catch (IOException e) { //auto-generated for .read()
         *    e.printStackTrace();
         * }
         * 
         */
        /* /46/ FileWriter (write a file)
         * import java.io.FileWriter
         * main:
         * try { //with FileWriter, we should add try and catch
         * FileWriter writer = new FileWriter("poem.txt");
         * writer.write("Roses are red \nViolets are blue");
         * writer.append("\n(..)"); // như cho thêm vào
         * writer.close();//make sure to close file after doing function => sẽ tự động tạo 1 file với tên đặt trước và có nội dung bên trong
         * } catch (IOException e){ //auto-generated 
         *    e.printStackTrace();
         * }
         * 
         */
        /* /45/ File class
         * file = An abstract representation of file and directory path-names
         * import java.io.File;
         * main:
         * File file = new File("C:\\Users\\ADMIN\\OneDrive - VietNam National University - HCM INTERNATIONAL UNIVERSITY\\Desktop\\code_java\\firstjava\\secret_message.txt"); //if "secret_message" => not exist
         * /if ur file within ur project folder => just need a name of file
         * /if file not within project folder => need full address of file
         * if(file.exists){
         *    System.out.println("exits");
         *    System.out.println(file.getpath()); => in ra tên của file (a name of file)
         *    System.out.println(file.getAbsolutePath()); => in ra đầy đủ address (full address of file)
         *    System.out.println(file.isFile()); => check if is it a file //if u select folder => false
         *    file.delete(); //delete file after running it
         * }
         * else{
         *    System.out.println("not exits")
         * } => exits
         * 
         *  
         * 
         */
        /* /44/ exception handling 
         * //exception = an event that occurs during the execution of a program that,
         *               disrupts the normal flow of instruction
         * main:
         * Scanner scanner = new Scanner(System.in)
         * try {
         * 
         * System.out.println("Input x");
         * int x = scanner.nextInt();
         * System.out.println("Input y");
         * int y = scanner.nextInt();
         * int z = x/y;
         * System.out.println("result"+z);
         * } catch(ArithmeticException e) { //catch - mún xử lí lỗi mún tránh thì nhập trong catch(.... e)
         *    System.out.println("you cannot divide by 0");
         * } catch(InputMismatchException e){
         *    System.out.println("please enter a number")
         * } catch(Exception e){ //catch all exception
         *    System.out.println("Sth went wrong");
         * } finally { //always execute whether it catch any exception //sẽ lun thực hiện kể cả khi bắt được lỗi hay ko
         *    scanner.close(); // it's a good way to put a close function in finally block
         * 
         * }
         */
        /* /43/ Dynamic polymorphism 
         * polymorphism = many shapes/forms
         * dynamic = after compilation (during runtime)
         * 
         * ex. A corvette is a: corvette, and a car, and a vehicle, and an object 
         * 
         * //if we want to khai báo cái gì đó mà chưa rõ cái đó(ví dụ giới tính: nam hay nữ) là gì thì nên dùng kiểu này
         * //practice: nên để @Override để mn đọc vô biết methods được viết đè lên
         * 
         * public class Animal{
         *    public void speak(){
         *        System.out.println("animal goes brrr")
         *    }
         * }
         * public class Dog extends Animal{
         *    public void speak(){
         *        System.out.println("dog goes bark")
         *    }
         * }
         * public class Cat extends Animal{
         *    public void speak(){
         *        System.out.println("cat goes Meow")
         *    }
         * }
         * import java.util.Scanner;
         * main:
         * Scanner scanner = new Scanner(System.in);
         * Animal animal;
         * 
         * System.out.print("1=dog 2=cat");
         * int choice = scanner.nextInt();
         * if (choice == 1){
         *    animal = new Dog();
         *    animal.speak();
         * }
         * else if (choice == 2){
         *    animal = new Cat();
         *    animal.speak()
         * }
         * else {
         *    animal = new Animal();
         *    System.out.println("invalid")
         *    animal.speak();
         * }
         * 
         */
        /* /42/polymorphism = greek word poly- "many", morph - "form"
                              The ability of an object to identify as more than one type
         * public class Vehicle {
         *    public void go(){}
         * }
         * public class Car extends Vehicle {
         *    public void go(){
         *        System.out.println("car run")
         *    }
         * }
         * public class Bicycle extends Vehicle {
         *    public void go(){
         *        System.out.println("bike run")
         *    }
         * }
         * public class Boat extends Vehicle {
         *    public void go(){
         *        System.out.println("boat run")
         *    }
         * }
         * main:
         * Car car = new Car();
         * Bicycle bicycle = new Bicycle();
         * Boat boat = new Boat();
         * Car[] racers = {car,bicycle,boat};//cannot store /nếu khai báo kiểu này thì chỉ lưu trữ được được car tương tự với Bicycle[] và Boat[]
         * Vehicle[] racers = {car,bicycle,boat};//can store /là cách khắc phục của việc khai báo trên vì car,bicycle,boat có cùng kiểu subclass của superclass Vehicle 
         * //or we can use Object[] racers
         * for(Vehicle x : racers){
         *    x.go(); //phải add class go cho superclass để có thể chạy được ctrinh
         * }
         * 
         */
        /* /41/ interface = a template that can be applied to a class
                            similar to inheritance, but specifies what a class has/must do
                            classes can apply more than one interface, inheritance is limited to 1 super class
         * public class Rabbit implements Prey{
         *    public void flee(){
         *        System.out.println("rabbiting is fleeing");
         *    }
         * }
         * public class Hawk implements Predator {
         *    public void hunt(){
         *        System.out.println("hawk is hunting");  
         *    }
         * }
         * public class Fish implements Prey,Predator{
         *    public void flee(){
         *        System.out.println("fish is fleeing");
         *    }
         *    public void hunt(){
         *        System.out.println("fish is hunting");
         *    }
         * }
         * public interface Prey {
         *    void flee(); //ko cần viết nội dung ở trong hàm
         * }
         * public interface Predator {
         *    void hunt();
         * }
         * main:
         * fish.hunt(); => fish is hunting
         * fish.flee(); => fish is fleeing
         * 
         */
        /* /40/ copy objects
         * public class Car {
         *    private String make;
         *    private String model;
         *    private int year;
         *    Car(String make,String model,int year){
         *        this.make = make; <=> this.setMake(make)
         *        this.model = model; <=> this.setModel(model)
         *        this.year = year; <=> this.setYear(year)
         *    }
         *    Car(Car x){
         *        this.copy(x);
         *    } 
         *    public String getMake() {
         *        return make;
         *    }
         *    public String getModel() {
         *        return model;
         *    }
         *    public int getYear() {
         *        return year;
         *    }
         *    public void setMake(String make) {
         *        this.make = make;
         *    }
         *    public void setModel(String model) {
         *        this.model = model;
         *    }
         *    public void setYear(int year) {
         *        this.year = year;
         *    }
         *    public void copy(Car x){
         *        this.setMake(x.getMade);
         *        this.setModel(x.getModel);
         *        this.setYear(x.getYear);
         *    }
         * }
         * main:
         * Car car1 = new Car("car1","hello",20);
         * Car car2 = new Car("car2","bai",80);
         * System.out.println(car1) // cho ra address của car1
         * System.out.println(car2) // cho ra address của car2
         * 
         * car2.copy(car1); //copy khi đã khởi tạo sẵn
         * 
         * Car car3 = new Car(car1); //copy cho cái khởi tạo mới
         * 
         * 
         * //chỉ copy nội dung của class này cho class khác
         */
        /* /39/ encapsulation = attributes of a class will be hidden or private
                                Can be accessed only through methods (getters & setters)
                                You should make attributes private if you don't have a reason to make them public/protected
         * public class Car {
         *    private String make;
         *    private String model;
         *    private int year;
         *    Car(String make,String model,int year){
         *        this.make = make; <=> this.setMake(make)
         *        this.model = model; <=> this.setModel(model)
         *        this.year = year; <=> this.setYear(year)
         *    }
         *    public String getMake() {
         *        return make;
         *    }
         *    public String getModel() {
         *        return model;
         *    }
         *    public int getYear() {
         *        return year;
         *    }
         *    public void setMake(String make) {
         *        this.make = make;
         *    }
         *    public void setModel(String model) {
         *        this.model = model;
         *    }
         *    public void setYear(int year) {
         *        this.year = year;
         *    }
         * }
         * main:
         * Car car = new Car("hello","bai",123);
         * System.out.println(car.make) //error
         * System.out.println(car.getMake) => hello
         * 
         * car.year = 2023 //error because this variable is private
         * 
         */
        /* /38/ access modifiers
         * packet pack1;
         * public class A {
         *    protected String hel = "hel";
         *    main:
         *    C c = new C();
         *    System.out.println(c.defaultMess) => This is the default
         *    B b = new B();
         *    System.out.println(b.he) //error
         * }
         * public class B {
         *    private String he = "he";
         * }
         * 
         * packet pack2;
         * import pack1.*; //import everything
         * 
         * public class C {
         *    public String hello = "hello";
         *    protected String hel = "hel";
         *    String defaultMess = "This is the default";
         *    main:
         *    A a = new A();
         *    System.out.println(a.hel); //error
         *    B b = new B();
         *    System.out.println(b.he) //error
         * }
         * 
         * public class Asub extends A {
         *    main:
         *    A a = new A();
         *    System.out.println(a.hel); => hel
         *    C c = new C();
         *    System.out.println(c.defaultMess) => This is the default
         * }
         * 
         * 
         * // same package thì có thể thấy của nhau (giữa các class trong package)
         * // khai báo biến public thì có thể truy cập ở mọi package và từng class
         * // protected chỉ được truy cập trong class này khi class đó là subclass của Class chứa protected
         * // private chỉ được truy cập trong chính class của nó (ko được truy cập ở các class khác cùng pack và khác pack)
         */
        /* /37/ abstraction = abstract classes cannot be instantiated, but they can have a subclass
                              abstract methods are declared without an implementation
         * public class Car extends Vehicle {
         *    void go(){
         *        System.out.println("Running");
         * }
         * }
         * public abstract class Vehicle {
         *      abstract void go(); // ko cần viết implementation inside 
         * }
         * main:
         * Vehicle vehicle = new Vehicle(); // sẽ bị lỗi vì ko khai báo được
         * Car car = new Car();
         * //mục đích: để tạo ra tính tổng quát của vấn đề rồi sau đó chia thành từng lớp nhỏ khác mà đào sâu
         */
        /* /36/ super keyword
         * //super = keyword refers to the superclass (parent) of an object
                     very similar to the "this" keyword
         * public class Person {
         *    String name;
         *    int age;
         *    Person(String name,int age) {
         *        this.name = name;
         *        this.age = age;
         *    }
         *    public String toString() {
         *        return this.name + '\n' + this.age + "\n";
         *    }
         * }
         * public class Hero extends Person {
         *    String power;
         *    Hero(String name,int age,String power){
         *        super(name,age); // super có chức năng giống this (thay thế tên cho parentClass như Person)
         *        this.power = power;
         *    }
         *    public String toString() {
         *        return super.toString()+this.power;
         *    }
         * }
         * main:
         * Hero hero1 = new Hero("Batman",42,"$$$");
         * System.out.println(hero1.name) => Batman
         * System.out.println(hero1.age) => 42
         * System.out.println(hero1.power) => $$$
         * 
         */
        /* /35/ method overriding = Declaring a method in sub class,
                                    which is already present in parent class.
                                    done so that a child class can give its own implementation                               
         * public class Animal {
         *    void speak() {
         *        System.out.println("The animal speaks");
         *    }
         * }
         * public class Dog extends Animal {
         *    @Override (ghi chú) //ghi đè phương thức lên (là nó sẽ lấy phương thức sau mà thực hiện)
         *    void speak() {
         *        System.out.println("The dog goes bark");
         *    }
         * }
         *    
         * }
         * main:
         * Animal animal = new Animal();
         * Dog dog = new Dog();
         * animal.speak(); => The animal speaks
         * dog.speak(); => The dog goes bark
         */
        /* /34/ inheritance = the process where one class acquires,
                              the attributes and methods of another
         * public class Vehicle {
         *    double speed;
         *    void go() {
         *        System.out.println("This vehicle is moving");
         *    }
         *    void stop() {
         *        System.out.println("This vehicle is stopped");
         *    }
         * }
         * public class Car extends Vehicle {
         *    int wheels = 4;
         *    int doors = 4;
         * }
         * public class Bicycle extends Vehicle {
         *    int wheels = 2;
         *    int pedals = 2;
         * }
         * // => Car,Bicycle : sub-class of Vehicle //là Vehicle cho hết các thành phần mà nó có cho các subClass
         * main:
         * Car car = new Car();
         * car.go(); => This vehicle is moving
         * 
         * Bicycle bike = new Bicycle();
         * 
         * bike.stop(); => This vehicle is stopped
         * 
         * System.out.println(car.speed) => 0.0
         * System.out.println(bike.speed) => 0.0
         * //có thể thêm vài biến khác nhau cho class Car và Bicycle để có thể nhìn rõ là khác biệt (được thêm các yếu tố phụ cho từng subClass)
         * System.out.println(car.doors) => 4
         * System.out.println(bike.pedals) => 2
         */
        /* /33/ static keyword
         * //static = modifier. A single copy of a variable/method is created and shared
         *            The class "owns" the static member
         * public class Friend{
         *    String name;
         *    static int numberOfFriends;
         *    Friend(String name){
         *        this.name = name;
         *        numberOfFriends++;
         *    }
         *    static void displayFriends() {
         *        System.out.println("You have "+numberOfFriends+" friends");
         *    }
         * }
         * main:
         * Friend friend1 = new Friend("ab");
         * System.out.println(Friend.numberOfFriends); => 1
         * Friend friend2 = new Friend("bc");
         * System.out.println(Friend.numberOfFriends); => 2
         * 
         * Friend.displayFriends();
         * 
         * // có thể dùng <tên class chính>.<tên biến static> (ex: Friend) để in ra nhưng với tên class phụ (ex: friend1) thì ko thể gọi như vậy
         *  
         * 
         */
        /* /32/ object passing //gán object vào 1 object khác (hoặc gán class vào 1 class khác)
         * public class Garage {
         *    void park(Car car){
         *      System.out.println("The "+car.name+" is parked in the garage");   
         *    }
         * }
         * public class Car {
         *    String name;
         *    Car(String name){
         *      this.name = name;
         *    }
         * }
         * main:
         * Garage garage = new Garage();
         * Car car1 = new Car("BMW");
         * Car car2 = new car("Tesla");
         * garage.park(car1); => The BMW is parked in the garage
         * garage.park(car2); => The Tesla is parked in the garage
         * 
         * 
         */
        /* /31/ array of objects
         * // khai báo array
         * int[] numbers = new int[3];
         * char[] characters = new char[4];
         * String[] strings = new String[5];
         * 
         * Food[] refrigerator = new Food[3]; // tạo array of objects
         * 
         * //khởi tạo objects trong array
         * Food food1 = new Food("pizza");
         * Food food2 = new Food("hamburger");
         * //gán objects cho array
         * refrigerator[0] = food1;
         * refrigerator[1] = food2;
         * 
         * or
         * Food[] refrigerator = {food1,food2,food3};
         * 
         */
        /* /30/ toString method
         * toString() = special method that all objects inherit
                        that returns a string that "textually represents" an object
                        can be used both implicitly and explicitly
         * public class Car {
         *    String make = "Ford";
         *    String model = "Mustang";
         *    String color = "red";
         *    int year = 2021;
         *    public String toString() {
         *        String myString = make + "\n" + model + "\n"+color+"\n"+year;
         *        return myString; // or return make + "\n" + model + "\n"+color+"\n"+year;
         * 
         * }
         * }                                        
         * public class Main {
         *    public static void main(String[] args){
         *        Car car = new Car();
         *        System.out.println(car) //implicitly; => Car@3fee733d (address of car because this is string)
         *        System.out.println(car.toString()) //explicitly
         * }
         * }
         * // ngta thường overwritten toString trong class mới 
         * sau khi viết
         * System.out.println(car)
         * System.out.println(car.toString()) 
         * => Ford
         * Mustang
         * red
         * 2021
         * // lưu ý: phương thức toString: khi in như ví dụ trên println(car) thì tương đương nó sẽ gọi car.toString (đồng nghĩa với việc nó sẽ in địa chỉ)
         * // để giải quyết: thì mình phải ghi đè phương trình toString khác trong class để có thể in cái mình mong muốn
         */
        /* /29/ overloaded constructors = multiple constructors within a class with the same name
                                          but have different parameters
                                          name + parameters = signature
         * public class Pizza {
            String bread;
            String sauce;
            String cheese;
            String topping;
            Pizza(String bread,String sauce,String cheese){
                this.bread = bread;
                this.sauce = sauce;
                this.cheese = cheese;
            }
            Pizza(String bread,String sauce,String cheese,String topping){
                this.bread = bread;
                this.sauce = sauce;
                this.cheese = cheese;
                this.topping = topping;
            }
          }
         * 
         */
        /* /28/ variable scope
        * //local = declared inside a method
                    visible only to that method
        * //global = declared outside a method, but within a class
                     visible to all parts of a class
        * public class Main {
            public static void main(String[] args){
                DiceRoller diceRoller = new DiceRoller()
            }
        }
        // local
        * import java.util.Random
        * public class DiceRoller {
            DiceRoller() {
              Random random = new Random();
              int number = 0;
              roll(random,number);
            }
            void roll(Random random,int number) {
              number = random.nextInt(6)+1;
              System.out.println(number);
            }
        }
        //global
        * import java.util.Random
        * public class DiceRoller {
            Random random;
            int number;
            DiceRoller() {
              random = new Random();
              roll();
            }
            void roll() {
              number = random.nextInt(6)+1;
              System.out.println(number);
            }
        }
        */ 
        /* /27/ Constructors = special method that is called when an object is instantiated (created)
         * public class Human {
         *    String name;
         *    int age;
         *    double weight;
         *    Human(String name, int age,int double weight) {
         *        this.name = name;
         *        this.age = age;
         *        this.weight = weight;
         * }
         *    void eat() {
         *        System.out.println(this.name+" is eating");   
         * }
         *    void drink() {
         *        System.out.println(this.name+" is drinking");
         * }
         * }
         * 
         * public class Main {
         *    public static void main(String[] args){
         *        Human human1 = new Human("Bro",65,70);
         *        Human human2 = new Human("Quoc",65,70);
         *        human2.eat(); => Quoc is eating
         *        human1.drink(); => Bro is drinking
         * }
         * }
         */      
        /* /26/ //objects = an instance of a class that may contain attributes and methods
                            ex: (phone, desk, computer, coffee cup)
         * (có thể tạo class băng 1 file riêng hoặc để cùng 1 file mà 2 class riêng lẻ)
         * // trước mắt thi chương trình chỉ có thể theo kiểu mỗi class một file riêng
         * public class Car {
         *    String make = "ab";
         *    String model = "cd";
         *    int year = 2020;
         *    String color = "blue";
         *    double price = 50000.00;
         *    void drive() {
                System.out.println("You drive the car");
              }
              void brake() {
                System.out.println("You step on the brakes");
              }
         * }
         * 
         * or 
         * public class Main {
         *    public static void main(String[] args){
         *        Car myCar = new Car(); //(tên class) + tên biến = new + (tên class) + ();
         *        System.out.println(myCar.model);
         * 
         *        myCar.drive() => You drive the car
         * }
         * }
         * public class Car
         * 
         * 
         */
        /* /25/ //final keywords
         * final (ko thể thay đổi hay cập nhật cho biến) (thường có quy tắc chung là để tên biến viết in hoa hết khi đặt trong final)
         * final double pi = 3.14159;
         * pi = 4 (error)
         * 
         */
        /* /24/ //printf() = an optional method to control, format, and display text to the console window
                             two arguments = format string + (object/variable/value)
                             % [flags] [precision] [width] [conversion-character]
         * 
         * System.out.printf("This is a format string %d",123)
         * %d => int
         * %b => boolean
         * %c => char
         * %s => string
         * %f => double
         * 
         * String myString = "Bro";
         * double myDouble = 200;
         * // [width] minimum number of characters to be written as output
         * System.out.printf("Hello %10s",myString) => Hello        Bro
         * System.out.printf("Hello %-10s",myString) => "Hello Bro       "
         * 
         * // [precision] sets of digits of precision when outputting floating-point values
         * System.out.printf("%.2f",myDouble) => 200.00
         * 
         * // [flags] adds an effect to output based on the flag added to format specifier
         * - : left-justify
         * + : output a plus (+) or minus (-) sign for a numeric value
         * 0 : numeric values are zero-padded
         * , : comma grouping separator if numbers > 1000
         * double myDouble = 200;
         * System.out.printf("%+f",myDouble) => +200.
         * double myDouble = -200;
         * System.out.printf("%+f",myDouble) => -200.
         * 
         * System.out.printf("hello %010f",a); => hello -002000.00
         * 
         * System.out.printf("hello %,f",a); => hello -2,000.000000
         * 
         */
        /* /23/ //overloaded methods = methods that share the same name but have different parameters
                                       method name + parameters (quantity of parameters / data type / orders)= method signature (hàm cùng tên với nhiều biến tham chiếu khác nhau)
         * 
         * static int add(int a,int b){
         * return a + b}
         * static int add(int a,int b,int c){
         * return a + b + c}
         * static int add(int a,int b,int c,int d){
         * return a + b + c + d}
         * static double add(double a,double b){
         * return a + b}
         * 
         * => accepted
         */
        /* /22/ //methods = a block of code that is executed whenever it is called upon
         * main:
         * {int x =3, y = 4;
         * int z = sum(x,y); => 7
         * }
         * static int sum(int x,int y){
         * int z = x + y;   
         * return z;
         * }
         */
        /* /21/ //for-each = traversing technique to iterate through the elements in an array/collection
                             less steps, more readable
                             less flexible
         * 
         * String[] animals = {"ab","bc","cd"};
         * or
         * ArrayList<String> animals = new ArrayList<String>();
         * 
         * animals.add("ab");
         * animals.add("bc");
         * animals.add("cd");
         * 
         * for (String i : animals) {
         *    System.out.println(i);
         * } => ab bc cd
         */
        /* /20/ //2D ArrayList = a dynamic list of lists
                                 you can change the size of these lists during runtime
         * import java.util.*;
         * 
         * main:
         * ArrayList<ArrayList<String>> groceryList = new ArrayList();
         * 
         * ArrayList<String> bakeryList = new ArrayList();
         * bakeryList.add("ab");
         * bakeryList.add("bc");
         * bakeryList.add("cd");
         * 
         * ArrayList<String> drinkList = new ArrayList();
         * drinkList.add("1");
         * drinkList.add("2");
         * drinkList.add("3");
         * 
         * groceryList.add(bakeryList);
         * groceryList.add(drinkList);
         * groceryList.get(0).get(0) => ab
         * bakeryList.get(0) => ab // name.get(index)
         * 
         * 
         */
        /* /19/ //ArrayList = a resizable array
                              Elements can be added and removed after compilation phase
                              store reference data types
         * import java.util.ArrayList;
         * 
         * main:
         * ArrayList<String> food = new ArrayList<String>();
         * 
         * food.add("pizza"); //add to arraylist
         * food.add("coca");
         * 
         * food.set(0,"hello") //food.set(index, element) //dùng để thay thế phần tử trong arraylist
         * food.remove(1) //food.remove(index) //dùng để xóa phần tử trong arrayList
         * food.clear() //xóa hết các phần tử
         * 
         * for(int i = 0;i < food.size();i++){
         *      System.out.println(food.get(i));
         * }
         * 
         * or ArrayList<Integer>
         */
          /* /18/ //wrapper classes = provides a way to use primitive data types as reference data types 
                                    reference data types contain useful methods
                                    can be used with collections (ex.ArrayList)
         * 
         * primitive    //wrapper (khác biệt có ở đầu chữ viết hoa) // công dụng để cho biến theo kiểu dữ liệu reference 
         * ----         ----
         * boolean      Boolean
         * char         Character
         * int          Integer
         * double       Double
         * 
         * autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes //coi tham khảo (vì đây máy sẽ tự động chuyển các kiểu dữ liệu phù hợp trong các hàm)
         * unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive //coi tham khảo (vì đây máy sẽ tự động chuyển các kiểu dữ liệu phù hợp trong các hàm)
         * 
         * Boolean a = true;
         * Character b = '$';
         * Integer c = 123;
         * Double d = 3.14;
         * String e = "Bro";
         * 
         * Ex: 
         * if (a==true) //a lúc đầu được khai báo theo kiểu reference nhưng khi ở trong hàm if nó phải dùng kiểu primitive (unboxing)
         * 
         */
        /* /17/ //String method = a reference data type that can store one or more characters reference data types have access to useful methods
         * String name = "Bro";
         * 
         * boolean result = name.equals("Bro") => true
         * boolean result = name.equalsIgnoreCase("bro") => true
         * 
         * int result = name.length(); => 3
         * char result = name.charAt(0) => B
         * char result = name.charAt(1) => r
         * 
         * int result = name.indexOf("B") => 0 (ko tìm thấy thì in ra -1)
         * 
         * boolean result = name.isEmpty(); => false
         * String result = name.toUpperCase(); => BRO
         * String result = name.toLowerCase(); => bro
         * String result = name.trim(); //xóa khoảng trắng ở đoạn đầu và đoạn cuối của chuỗi string
         * Ex: "   Bro 1  " => "Bro 1"
         * 
         * String result = name.replace('o','a') => Bra //.replace(old char,new char)
         * 
         */
        /* /16/ //2D array = an array of arrays
         * String[][] cars = new String[3][3];
         * or
         * String[][] cars = {{"hello","bai"},{"hom","nay"}};
         * 
         */
        /* /15/ //arrays = used to store multiple values in a single variables
         * or int[] ab = {1,2,3}
         * String[] cars = {"ab","cd","ef"}; //khai báo và gán biến 
         * cars[0] = "1";
         * system.out.println(cars[0]) => 1
         * system.out.println(cars[1]) => cd
         * 
         * or
         * String[] cars = new String[3]; //khai báo rõ số lượng
         * cars[0] = "ab";
         * cars[1] = "cd";
         * cars[2] = "ef";
         * cars.length => 3
         */
        /* /14/ //nested loop = a loop inside of a loop
         * for(int i = 0;i < 10;i++){
         *      for(int j = 0;j < 10;j++){
         * }
         * }
         */
        /* /13/ //for loop = executes a block of code a limited amount of times
         * for(int i = 0;i < 10;i++){
         *      ....;
         * }
         * 
         */      
        /* /12/ //while loop = executes a block of code as long as a it's condition remains true
         * String name = "";
         * 
         * while (name.isBlank()){
         *      ....;
         * }
         * 
         * or
         * do {
         *      .....;
         * }while ();
         * 
         */
        /* /11/ //logical operators = used to connect two or more expressions
         * && = (and) // || = (or) // ! = (Not)
         * 
         * String response = scanner.next(); //dùng để nhập giá trị
         * 
         * response.equals("...") // trả giá trị true or false
         * 
         * 
         */
        /* /10/ //switches = statement that allows a variable to be tested for equality against a list of values
         * String day = "Sunday";
         * 
         * switch(day){
         *      case "Sunday": ...;
         *      break;
         *      case : ...;
         *      break;
         *      default: ...;
         * }
         * 
         */
        /* /9/ //if statement
         * if () {
         * }
         * else if () {
         * }
         * else
         * 
         */
        /* /8/ //Random numbers
         * import java.util.Random;
         * 
         * main:
         * Random random = new Random();
         * int x = random.nextInt(6); //random from 0 to 5
         * double y = random.nextDouble(); //random from 0 to 1
         * boolean z = random.nextBoolean(); //random between True and False
         */
        /* /7/ //Math class
          * 
          * double x = 3.14;
            double y = -10;
            double z = Math.max(x,y);
            or Math.abs(x,y);
            or Math.sqrt(x);
            or Math.round(x);
            or Math.ceil(x);
            or Math.floor(x);
          * 
          */
        /* /5/ //expression = operands & operators
         * operands = values, variables, numbers, quantity
         * operators = + - * / %
         * 
         * double x = 10;
         * x++;
         * x--;
         * x = (double) x / 3;
         */
        /* /4/ //user input
         * import java.util.Scanner;
         * 
         * main:
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("what is ur name!");
         * String name = scanner.nextLine(); //nhap chuoi string
         * System.out.println("How old are you");
         * int age = scanner.nextInt(); //nhap so nguyen
         * 
         * //note: nếu dùng nextLine rồi dùng tiếp loại khác với nextLine thì sẽ ra kết quả ko mong muốn(nếu 2 cái cùng loại liên tiếp nhau thì vẫn ok)
         * Ex: 
         * String name = scanner.nextLine();
         * 
         * int age = scanner.nextInt();
         * scanner.nextLine(); (cách giải quyết)
         * 
         * String height = scanner.nextLine;
         * 
         */
        /* /2/ //variables
          * * boolean /primitive/ // 1 bit // true or false
          * byte /primitive/ // 1 byte // -128 to 127
          * short /primitive/ // 2 bytes // -32,768 to 32767 
          * * int /primitive/ // 4 bytes // -2 billion to 2 billion
          * long /primitive/ // 8 bytes // -9 quintillion to 9 quintillion
          * float /primitive/ // 4 bytes // fractional number up to 6-7 digits 
          * Ex: float x = 3.1415f // phải khai báo đúng theo quy tắc
          * * double /primitive/ // 8 bytes // fractional number up to 15 digits
          * * char /primitive/ // 2 bytes //
          * * String /reference/ // varies // a sequence of characters
          *
          * primitive: 8 types(boolean,byte,..) / stores data / can hold only 1 value / less memory / fast
          * reference: unlimited (user defined) / stores address / could hold more than 1 value / more memory / slower
          * 
          * int x; //declaration
          * x = 123; //assignment
          * int x = 123 //initialization
          */
        /* /1/ //tutorial
           * System.out.println();
           * System.out.print();
           * \n
           * \t
           * // This is a comment
           * 
           */
    }
}
