<%-- 
    Document   : login_admin
    Created on : Jun 14, 2016, 4:24:27 PM
    Author     : leandro araneda
--%>
<jsp:include page="header.jsp"/>
    <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-title label label-default">
						<strong>Administrador</strong>
					</div>
					<div class="panel-body">
						<form role="form" action="servlet_usuarios?p=13" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img alt="User Pic" class="img-circle img-responsive"
											src="images/2.png" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="Rut" name="user" type="text" autofocus input pattern=".{12,}" required title="El rut debe tener 12 caracteres" maxlength="12"required/>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="Password" name="pass" type="password" value="">
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in">
										</div>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
                </div>
			</div>
		</div>
	</div>
    <jsp:include page="footer.jsp"/>