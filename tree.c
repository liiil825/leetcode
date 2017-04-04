void in_order_traversal(TreeNode* root) {
  if (root -> lchild != NULL) in_order_traversal(root -> lchild);
  // Do something with root
  if (root -> rchild != NULL) in_order_traversal(root -> rchuild);
}

void pre_order_traversal(TreeNode* root) {
  // Do something with root

  if (root -> lchild != NULL) pre_order_traversal(root -> lchild);
  if (root -> rchild != NULL) pre_order_traversal(root -> rchuild);
}

void post_order_traversal(TreeNode* root) {
  if (root -> lchild != NULL) post_order_traversal(root -> lchild);
  if (root -> rchild != NULL) post_order_traversal(root -> rchuild);
  // Do something with root
}
