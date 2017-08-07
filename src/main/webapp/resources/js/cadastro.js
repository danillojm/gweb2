/**
 * @Danillo melo
 */

angular.module("cadastro", []);

angular.module("cadastro").controller("cadastrarController",
		function($scope, $http) {

			$scope.formacaoAcademica = {
				instituicao_ensino : '',
				curso : '',
				matricula : '',
				anoIngresso : '',
				semestre_inicial : '',
				semestre_atual : ''
			}

			$scope.aluno = {
				nome : '',
				cpf : '',
				rg : '',
				sexo : '',
				datNasc : '',
				estadoCivil : '',
				nomPai : '',
				nomMae : '',
				numero_contato : '',
				formacao_academica : {
					instituicao_ensino : '',
					curso : '',
					matricula : '',
					anoIngresso : '',
					semestre_inicial : '',
					semestre_atual : ''
				}
			}
			$scope.salvar = function(aluno) {

				$http.post('/Gweb/rest/aluno', aluno).success(function(data) {
					if (data == "200") {
						alert("Foi salvo com sucesso");
					}
				});

				// http://localhost:8080/Gweb/rest/
				//		 
				/* $scope.alunos.push(angular.copy(aluno)); */
			}

		})
