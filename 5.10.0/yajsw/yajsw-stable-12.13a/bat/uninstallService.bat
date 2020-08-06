pushd %~dp0
call setenv.bat %1
%wrapper_bat% -r %conf_file%
popd
