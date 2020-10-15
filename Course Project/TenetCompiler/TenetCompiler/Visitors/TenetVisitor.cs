using Antlr4.Runtime.Tree;

namespace TenetCompiler.Visitors
{
	public class TenetVisitor: TenetBaseVisitor<string>
	{
		private DefineConstVisitor ConstVisitor { get; set; } = new DefineConstVisitor();
		private DefineVariableVisitor VariableVisitor { get; set; } = new DefineVariableVisitor();

		private OperationVisitor OperationVisitor { get; set; } = new OperationVisitor();

		public override string Visit(IParseTree tree)
		{
			return tree.Accept(this);
		}

		public override string VisitDefine_constant(TenetParser.Define_constantContext context)
		{
			return ConstVisitor.VisitDefine_constant(context);
		}

		public override string VisitDefine_variable(TenetParser.Define_variableContext context)
		{
			return VariableVisitor.VisitDefine_variable(context);
		}

		public override string VisitOperation(TenetParser.OperationContext context)
		{
			return OperationVisitor.VisitOperation(context);
		}
	}
}
