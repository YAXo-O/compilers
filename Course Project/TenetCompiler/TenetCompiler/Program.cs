using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using TenetCompiler.Visitors;

using static Llvm.NET.Interop.Library;


namespace TenetCompiler
{
	class Program
	{
		static void Main(string[] args)
		{
			using (InitializeLLVM())
			{
				// Register LLVM for current host-architecture
				// TODO: in the future change for target ternary arch;
				RegisterNative();

				MainLoop();
			}
		}

		public static void MainLoop()
		{
			var text = "";
			while (true)
			{
				var input = System.Console.ReadLine();
				if (input == "parse()") break;

				text += input;
			}

			AntlrInputStream stream = new AntlrInputStream(text);
			TenetLexer lexer = new TenetLexer(stream);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			TenetParser parser = new TenetParser(tokenStream);
			IParseTree tree = parser.program();

			var result = new TenetVisitor().Visit(tree);

			System.Console.WriteLine(result);
		}
	}
}
