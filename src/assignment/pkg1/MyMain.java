        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

        /**
         *
         * @author ejgo
         */
        public class MyMain {

            /**
             * @param args the command line arguments
             */
            public static void main(String[] args) {
                // TODO code application logic here
            }

                public void method1(Integer n) throws MyException1, MyException2, MyException1Child {
                        switch (n) {
                        case 1:
                                throw new MyException1("1");
                        case 2:
                                throw new MyException2("2");
                        case 11:
                                throw new MyException1Child("11");
                        case 90:
                        case 91:
                                System.out.println("bla bla");
                                break;
                        default:
                                throw new IllegalArgumentException("Default has thrown a RuntimeException!");
                        }
                }

                public static void useMethod1(Integer _inp) {
                        MyMain m = new MyMain();

                        try {
                                m.method1(_inp);
                        } catch (MyException1Child e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException1 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException2 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }

                public static void useMethod2(Integer _inp) {
                        MyMain m = new MyMain();
                        try {
                                m.method1(_inp);
                        } catch (MyException1 | MyException2 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }

                public static void useMethod3(Integer _inp) throws MyException1Child, MyException1, MyException2 {
                        MyMain m = new MyMain();
                        m.method1(_inp);
                }

                public static void useMethod4(Integer _inp) {
                        MyMain m = new MyMain();
                        try {
                                m.method1(_inp);
                        } catch (MyException1Child  e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException2   e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException1 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        // NOTE below line should be above line catch (MyException1  e) {
        //		} catch (MyException1Child  e) {
        //			// TODO Auto-generated catch block
        //			e.printStackTrace();
                        }
                }

                public static void useMethod5(Integer _inp) {
                        MyMain m = new MyMain();
                        try {
                                m.method1(_inp);
                        } catch (MyException1Child e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException1 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (MyException2 e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (Exception e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }

                public static void useMethod6(Integer _inp) throws MyException1 {
                MyMain m = new MyMain();
                try {
                        m.method1(_inp);
                } catch (MyException1Child e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (MyException1 e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (MyException2 e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        // NOTE can wrap an Exception ( Throwable) into another Exception via its constructor like below
                        MyException1 e1 = new MyException1("got MyException2 " + e.getMessage(), e);
                        throw e1;
                }
        }



       }
