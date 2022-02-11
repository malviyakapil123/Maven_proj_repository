function checkPassword(theForm) {
    if (theForm.pwd.value != theForm.cpwd.value)
    {
        alert('The password does not match!');
        return false;
    } else {
        return true;
    }
}