package DLWJ.SingleLayerNeuralNetworks;

public class Perceptrons {
    final int train_N = 1000;  // 训练数据的数量
    final int test_N = 200; //测试数据的数量
    final int nIn = 2; //输入数据的维度

    double [][] treain_X = new double[train_N][nIn]; // 用于训练的输入数据
    int [] train_T = new int[train_N];  // 用于训练的输出数据

    double[][] test_X = new double[test_N][nIn];  //用于测试的输入数据
    int [] test_T = new int[test_N];  //用于测试数据的实际标记
    int [] predicted_T = new int[test_N]; // 模型预测的数据

    final int epochs = 2000;  // 用于迭代的最大次数
    final double learningRate = 1.; // 感知器中学习率为1

}
