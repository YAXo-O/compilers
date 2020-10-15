namespace TenetCompiler.Visitors
{
	public class OperationVisitor: TenetBaseVisitor<string>
	{
		public override string VisitOperation(TenetParser.OperationContext context)
		{
			if (context.declare_function() != null)
			{
				return $"Operation: declare function -> {context.declare_function().GetText()}";
			}

			if (context.define_function() != null)
			{
				return $"Operation: define function -> {context.define_function().Accept(new DefineConstVisitor())}";
			}

			if (context.define_variable() != null)
			{
				return $"Operation: define variable -> {context.define_variable().Accept(new DefineVariableVisitor())}";
			}

			if (context.define_constant() != null)
			{
				return $"Operation: define constant -> {context.define_constant().Accept(new DefineConstVisitor())}";
			}

			if (context.expression() != null)
			{
				return $"Operation: expression -> {context.expression().GetText()}";
			}

			return "Empty operation";
		}
	}
}
